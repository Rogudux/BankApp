package com.example.bankapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.R
import com.example.bankapp.ui.theme.AccentBlack
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.CardBeige
import com.example.bankapp.ui.theme.TextColor

@Composable
fun Header(){

    Row (modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {

        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = Modifier.size(50.dp).background(color = CardBeige, shape = CircleShape),
            tint = AccentBlack,

        )
        
        Column (
            modifier = Modifier.weight((1f)).padding(start = 10.dp)
        ){


            Text(
                text = stringResource(R.string.user),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = TextColor

            )
            Text(
                text = "${stringResource(R.string.welcome)} ",
                fontSize = 17.sp,
                color = Color.Gray
            )

        }//Termina column

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            tint = AccentBlack,


            )



    }//Termina el primer row


}

@Preview(
    showBackground = true,
    device = Devices.PIXEL
)
@Composable
fun HeaderPreview(){
    BankAppTheme {
        Header()
    }
}