package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.a511lasalleapp.utils.MockData.Subject
import com.example.a511lasalleapp.utils.MockData.Student
import androidx.compose.foundation.lazy.items



@Composable
fun GradesScreen(student: Student, navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Nombre: ${student.name}", fontSize = 20.sp)
        Text("Carrera: ${student.career}", fontSize = 20.sp)
        Text("Semestre: ${student.semester}", fontSize = 20.sp)
        Text("Promedio Acumulado: ${student.average}", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Text("Materias:", fontSize = 22.sp)
        LazyColumn {
            items(student.subjects) { subject ->
                SubjectItem(subject) {
                    navController.navigate("subject_grades/${subject.name}")
                }
            }
        }
    }
}

@Composable
fun SubjectItem(subject: Subject, onClick: () -> Unit) {
    Row(modifier = Modifier.fillMaxWidth().clickable(onClick = onClick).padding(8.dp)) {
        Text(subject.name, fontSize = 18.sp, modifier = Modifier.weight(1f))
        Text("Promedio: ${subject.average}", fontSize = 18.sp)
    }
}
