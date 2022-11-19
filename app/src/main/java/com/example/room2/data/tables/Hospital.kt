package com.example.room2.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Hospital (
    @PrimaryKey(autoGenerate = false)
    val hospitalName:String
)