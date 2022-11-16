package com.example.room.data.tables

import androidx.room.Embedded
import androidx.room.Relation

data class StudentWithSubjects (
    @Embedded val student:Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName"
    )
    val subjects:List<Subject>
)