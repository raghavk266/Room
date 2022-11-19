package com.example.room2.data.tables

import androidx.room.Embedded
import androidx.room.Relation

data class HospitalAndHod (
    @Embedded val hospital: Hospital,
    @Relation(
        parentColumn="hospitalName",
        entityColumn = "hospitalName"
    )
    val hod:Hod
    )