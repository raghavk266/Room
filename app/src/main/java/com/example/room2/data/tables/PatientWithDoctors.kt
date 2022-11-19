package com.example.room2.data.tables

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.PrimaryKey
import androidx.room.Relation

data class PatientWithDoctors (
    @Embedded val patient:Patients,
    @Relation(
        parentColumn = "patientName",
        entityColumn = "doctorName",
        associateBy = Junction(PatientDoctorCrossRef::class)
    )
    val doctors:List<Doctors>
        )