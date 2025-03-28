package com.example.bankapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.components.CateBox
import com.example.bankapp.components.Header
import com.example.bankapp.components.TransCard
import com.example.bankapp.models.trans
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.TextColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BankAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(innerPadding)

                }
            }
        }
    }
}



@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier.fillMaxSize().padding(innerPadding)
    ){

    Header()
    CateBox()

        Spacer(modifier = Modifier.padding(5.dp))
    Row {
        Text(
            text = "Transactions",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = TextColor,
            modifier = Modifier.weight((1f))
        )

        Text(
            text = "See All",
            fontSize = 15.sp,
            color = Color.Gray,
            modifier = Modifier.padding(vertical= 5.dp)
        )

    }
        LazyColumn (modifier = Modifier.fillMaxWidth()) {
            items(trans) { tran ->
                TransCard(trans = tran)
            }
        }


    }
}

@Preview(
showBackground = true,
showSystemUi = true,
device = Devices.PIXEL
)

@Composable
fun HomeScreenPreview() {
    BankAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}