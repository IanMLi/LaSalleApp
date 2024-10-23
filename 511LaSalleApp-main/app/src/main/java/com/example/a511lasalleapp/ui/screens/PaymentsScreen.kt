import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.a511lasalleapp.utils.MockData.PaymentMonth

@Composable
fun PaymentRow(month: PaymentMonth) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Nombre del mes
        Text(text = month.month)

        // Ícono que indica si está pagado o pendiente
        if (month.isPaid) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "Pagado",
                tint = Color.Green,
                modifier = Modifier.size(24.dp)
            )
        } else {
            Icon(
                imageVector = Icons.Default.Warning,
                contentDescription = "Pendiente",
                tint = Color.Red,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun PaymentsScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Pantalla de Pagos", fontSize = 20.sp)
        val paymentMonths = PaymentMonth

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        paymentMonths.forEach { month ->
            PaymentRow(month = month)
        }
    }
}


    class PaymentsScreen {

    }
