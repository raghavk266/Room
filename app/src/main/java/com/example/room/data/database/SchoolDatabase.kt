package com.example.room.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room.data.dao.SchoolDirectorDao
import com.example.room.data.tables.*

@Database(entities = [
    School::class,
    Student::class,
    Subject::class,
    Director::class,
    StudentSubjectCrossRef::class], version = 1)
abstract class SchoolDatabase : RoomDatabase(){

    abstract fun getDao():SchoolDirectorDao

    companion object{
        var INSTANCE:SchoolDatabase? = null
        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this){
                val instance = Room.databaseBuilder(context,SchoolDatabase::class.java,"school_db").build()
                INSTANCE = instance
                return INSTANCE!!
            }
        }
    }
}