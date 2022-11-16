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

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName= :schoolName")
    suspend fun getSchoolWithStudents(schoolName:String):List<SchoolWithStudents>
    @Transaction
    @Query("SELECT * FROM school WHERE schoolName=:schoolName")
    suspend fun getAllDirectorsWithSchoolName(schoolName:String):List<SchoolAndDirector>
}