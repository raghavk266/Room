package com.example.room2.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Doctors(
    @PrimaryKey(autoGenerate = false)
    val doctorName:String,
    val designation:String,
    val hospitalName:String
)
