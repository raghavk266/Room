package com.example.room2.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Hod (
        @PrimaryKey(autoGenerate = false)
        val hodName:String,
        val department:String,
        val hospitalName:String
        )