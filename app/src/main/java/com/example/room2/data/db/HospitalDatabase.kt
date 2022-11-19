package com.example.room2.data.db

import android.content.Context
import androidx.room.Dao
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class HospitalDatabase : RoomDatabase(){
    abstract fun hospitalDao() : Dao
    companion object{
        @Volatile
        var INSTANCE : HospitalDatabase? = null
        fun getInstance(context: Context): HospitalDatabase{
            synchronized(this){
                return INSTANCE ?: Room.databaseBuilder(context,HospitalDatabase::class.java,"Hospital Database").build().also {
                    INSTANCE = it
                }
            }
        }
    }
}