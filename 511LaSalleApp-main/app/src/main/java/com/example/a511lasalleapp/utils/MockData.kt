package com.example.a511lasalleapp.utils

import com.example.a511lasalleapp.models.Community
import com.example.a511lasalleapp.models.News

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

data class Student(
    val fullName: String,
    val birthDate: String,
    val email: String,
    val profileImageUrl: String
)

object MockData {
    val student = Student(
        fullName = "Rodrigo Torres de la Garza",
        birthDate = "27 de abril de 1998",
        email = "Rtd26309@lasallebajio.edu.mx",
        profileImageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fgenius.com%2Falbums%2FNsqk%2FAtp&psig=AOvVaw1jd18Mky5INQUN7ukXnPMd&ust=1729742729608000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNjX3IjQo4kDFQAAAAAdAAAAABAE"
    )

    data class Student(
        val name: String,
        val career: String,
        val semester: Int,
        val average: Double,
        val subjects: List<Subject>
    )

    data class Subject(
        val name: String,
        val average: Double,
        val grades: List<Double>
    )



data class PaymentMonth(val month: String, val isPaid: Boolean)

object MockData {
    val paymentMonths = listOf(
        PaymentMonth("Enero", true),
        PaymentMonth("Febrero", true),
        PaymentMonth("Marzo", true),
        PaymentMonth("Abril", true),
        PaymentMonth("Mayo", true),
        PaymentMonth("Junio", true),
        PaymentMonth("Julio", true),
        PaymentMonth("Agosto", true),
        PaymentMonth("Septiembre", true),
        PaymentMonth("Octubre", true),
        PaymentMonth("Noviembre", false),
        PaymentMonth("Diciembre", false)
    )
}

}
