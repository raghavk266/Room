package com.example.room2.data.tables

import androidx.room.Embedded
import androidx.room.Relation

data class HospitalWithDoctors (
    @Embedded val hospital:Hospital,
    @Relation(
        parentColumn = "hospitalName",
        entityColumn = "hospitalName"
    )
    val doctors:List<Doctors>
    )