package com.example.room2.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Patients (
    @PrimaryKey(autoGenerate = false)
    val patientName:String,
    val diagnosis:String,
    val doctor:String
    )