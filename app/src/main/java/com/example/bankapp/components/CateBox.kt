package com.example.bankapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.ui.theme.AccentBlack
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.CardBeige
import com.example.bankapp.ui.theme.CardGreen
import com.example.bankapp.ui.theme.CardPurple
import com.example.bankapp.ui.theme.TextColor

@Composable
fun CateBox(){

    Row (modifier = Modifier.fillMaxWidth().height(400.dp),
        verticalAlignment = Alignment.CenterVertically) {

        Box(modifier = Modifier.weight((1f)).padding(end = 8.dp))

        { // BOX ACTIVIDAD
            Column ( modifier = Modifier.fillMaxSize()
                .clip(RoundedCornerShape(30.dp))
                .background(color = CardGreen),
                Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp),
                    tint = AccentBlack,
                    )

                Text(
                    text= "Actividad",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextColor
                )

                Text(
                    text= "de la Semana",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray
                )

            }
        }

        Column (modifier = Modifier.weight((1f))){//COLUMN DE 2 BOX

            Box(modifier = Modifier.weight((1f)).padding(all = 5.dp))
            { //BOX VENTAS
                Column ( modifier = Modifier.fillMaxSize()
                    .clip(RoundedCornerShape(30.dp))
                    .background(color = CardBeige),
                    Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text= "Ventas",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )

                    Text(
                        text= "$280.99",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextColor
                    )

                }
            }

            Box(modifier = Modifier.weight((1f)).padding(all = 5.dp)){//BOX GANANCIAS

                Column ( modifier = Modifier.fillMaxSize()
                    .clip(RoundedCornerShape(30.dp))
                    .background(color = CardPurple),
                    Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text= "Ganacias",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )

                    Text(
                        text= "$281.99",

                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextColor
                    )

                }
            }
        }

    }

}

@Preview(
    showBackground = true,
    device = Devices.PIXEL
)
@Composable
fun CateBoxPreview(){
    BankAppTheme {
        CateBox()
    }
}
