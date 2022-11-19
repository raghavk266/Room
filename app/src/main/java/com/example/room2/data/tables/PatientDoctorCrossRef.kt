package com.example.room2.data.tables

import androidx.room.Entity

@Entity(primaryKeys = ["patientName","doctorName"])
data class PatientDoctorCrossRef (
        val patientName:String,
        val doctorName:String
        )