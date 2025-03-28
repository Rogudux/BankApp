package com.example.bankapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.R
import com.example.bankapp.models.Trans
import com.example.bankapp.ui.theme.AccentBlack
import com.example.bankapp.ui.theme.AccentBlue
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.CardBeige
import com.example.bankapp.ui.theme.TextColor


@Composable
fun TransCard(trans: Trans){
    Row (modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {

        //Esta es una funcion para envase al objeto que pasa el string a un icon
        fun getIconByName(iconName: String): ImageVector {
            return when (iconName) {
                "shopping" -> Icons.Default.ShoppingCart
                else -> Icons.Default.ShoppingCart
            }
        }

        Box(
            modifier = Modifier
                .size(45.dp)
                .background(color = trans.colorIcon, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = getIconByName(trans.iconName),
                contentDescription = null,
                modifier = Modifier.size(30.dp), // Tamaño del ícono más pequeño
                tint = Color.White
            )
        }

        Column (
            modifier = Modifier.weight((1f)).padding(start = 10.dp)
        ){

            Text(
                text = trans.title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor

            )
            Text(
                text =  trans.category,
                fontSize = 12.sp,
                color = Color.Gray
            )

        }//Termina column

        Column (
            modifier = Modifier.padding(start = 10.dp)
        ) {

            Text(
                text = trans.price,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor

            )
            Text(
                text = trans.hour,
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.align(Alignment.End)
            )

        }

    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL
)

@Composable
fun TransCardPreview(){
    BankAppTheme {
        TransCard(
            trans = Trans(
                iconName = "shopping",
                colorIcon = AccentBlue,
                title = "Nike Store",
                category = "Ropa & Zapatos",
                price = "-$27.67",
                hour = "2:23 PM"

            )

        )
    }
}