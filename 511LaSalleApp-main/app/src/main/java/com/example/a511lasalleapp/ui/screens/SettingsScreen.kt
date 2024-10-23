package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.a511lasalleapp.utils.MockData
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Star

@Composable
fun SettingsScreen(navController: NavController, innerPadding: PaddingValues) {
    val student = MockData.student

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
    ) {
        // Imagen circular del alumno
        Image(
            painter = rememberAsyncImagePainter(student.profileImageUrl),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Información del alumno
        Text(text = student.fullName, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = "Fecha de nacimiento: ${student.birthDate}")
        Text(text = "Correo: ${student.email}")

        Spacer(modifier = Modifier.height(32.dp))

        // Opciones de configuración
        OptionItem(
            title = "Cambiar contraseña",
            icon = Icons.Default.Lock,
            onClick = { navController.navigate("change_password") }
        )

        OptionItem(
            title = "Cambiar tema",
            icon = Icons.Default.Star,
            onClick = { navController.navigate("change_theme") }
        )
    }
}

@Composable
fun OptionItem(title: String, icon: androidx.compose.ui.graphics.vector.ImageVector, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = icon, contentDescription = title, tint = MaterialTheme.colorScheme.primary)
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = title, fontSize = 16.sp)
        }
        Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "Arrow", tint = Color.Gray)
    }
}

@Composable
fun ChangePasswordScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Pantalla para cambiar contraseña", fontSize = 20.sp)
    }
}

@Composable
fun ChangeThemeScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Pantalla para cambiar tema", fontSize = 20.sp)
    }
}