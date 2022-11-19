package com.example.room2.data.db

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room2.data.dao.HospitalDao
import com.example.room2.data.tables.*

@Database(entities = [
    Doctors::class,
    Hospital::class,
    Patients::class,
    Hod::class,
    PatientDoctorCrossRef::class
],
version = 1)
abstract class HospitalDatabase : RoomDatabase(){
    abstract fun hospitalDao() : HospitalDao
    companion object{
        @Volatile
        var INSTANCE : HospitalDatabase? = null
        fun getInstance(context: Context): HospitalDatabase{
            synchronized(this){
                return INSTANCE ?: Room.databaseBuilder(context,HospitalDatabase::class.java,"Hospital_Database").build().also {
                    INSTANCE = it
                }
            }
        }
    }
}