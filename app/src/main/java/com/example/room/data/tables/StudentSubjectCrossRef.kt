package com.example.room.data.tables

import androidx.room.Entity

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    val student:Student,
    val subject:Subject
)