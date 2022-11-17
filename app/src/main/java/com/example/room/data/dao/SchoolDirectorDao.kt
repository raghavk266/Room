package com.example.room.data.dao

import androidx.room.*
import com.example.room.data.tables.*

@Dao
interface SchoolDirectorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName= :schoolName")
    suspend fun getSchoolWithStudents(schoolName:String):List<SchoolWithStudents>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName=:schoolName")
    suspend fun getAllDirectorsWithSchoolName(schoolName:String):List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName= :subjectName")
    suspend fun getStudentsWithSubject(subjectName:String):List<SubjectWithStudents>

    @Transaction
    @Query("SELECT * FROM student WHERE studentName= :studentName")
    suspend fun getSubjectsWithStudent(studentName:String):List<StudentWithSubjects>

    @Query("SELECT * FROM student")
    suspend fun getAllStudents():List<Student>

}