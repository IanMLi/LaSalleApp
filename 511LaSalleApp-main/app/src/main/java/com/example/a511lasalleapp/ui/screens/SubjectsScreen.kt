package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SubjectGradesScreen(subjectName: String, student: Student) {
    val subject = student.subjects.find { it.name == subjectName }
    subject?.let {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Text("Calificaciones de ${it.name}", fontSize = 22.sp)

            it.grades.forEachIndexed { index, grade ->
                Text("Parcial ${index + 1}: $grade", fontSize = 20.sp)
            }
        }
    } ?: run {
        Text("Materia no encontrada", fontSize = 20.sp)
    }
}
