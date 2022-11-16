package com.example.room.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.room.data.tables.Director
import com.example.room.data.tables.School
import com.example.room.data.tables.SchoolAndDirector

@Dao
interface SchoolDirectorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Query("SELECT * FROM school WHERE schoolName=:schoolName")
    suspend fun getAllDirectorsWithSchoolName(schoolName:String):List<SchoolAndDirector>
}