package com.example.room2.data.tables

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class DoctorsWithPatients (
    @Embedded val doctor:Doctors,
    @Relation(
        parentColumn = "doctorName",
        entityColumn = "patientName",
        associateBy = Junction(PatientDoctorCrossRef::class)
    )
    val patients:List<Patients>
        )