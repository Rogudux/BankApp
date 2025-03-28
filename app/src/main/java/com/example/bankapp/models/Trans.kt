package com.example.bankapp.models

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import com.example.bankapp.ui.theme.AccentBlue
import java.util.UUID

data class Trans (

    val id: String = UUID.randomUUID().toString(),
    val iconName: String,
    val colorIcon : Color,
    val title: String,
    val category: String,
    val price: String,
    val hour : String

)

val trans = mutableStateListOf(
    Trans(
        iconName = "shopping",
        title = "Nike Store",
        category = "Ropa & Zapatos",
        price = "-$27.67",
        hour = "2:23 PM",
        colorIcon = Black
    ),
    Trans(
        iconName = "shopping",
        title = "Coca",
        category = "Restaurant & Coffee",
        price = "-$34.92",
        hour = "10:00 AM",
        colorIcon = AccentBlue
    )
)

