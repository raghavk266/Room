package com.example.room.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject (
        @PrimaryKey
        val subjectName:String
        )