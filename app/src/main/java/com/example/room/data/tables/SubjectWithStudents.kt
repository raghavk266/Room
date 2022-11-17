package com.example.room.data.tables

import androidx.room.Embedded
import androidx.room.Relation

data class SubjectWithStudents(
    @Embedded val subject:Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "schoolName"
    )
    val students:List<Student>
)