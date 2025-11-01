package com.example.formulir

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FormulirPendaftaran(modifier: Modifier){
    var textNama by remember { mutableStateOf(value="") }
    var textJK by remember { mutableStateOf(value="") }
    var textStatus by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf(value="") }

    var Nama by remember { mutableStateOf(value = "") }
    var JK by remember { mutableStateOf(value = "") }
    var Status by remember { mutableStateOf(value = "") }
    var Alamat by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-Laki", "Perempuan")
    val status_perkawinan: List<String> = listOf("Janda", "Lajang", "Duda")

    Column  (modifier= Modifier
        .fillMaxSize()
        .background(color=Color.White)
    ){
        Row (modifier= Modifier
            .padding(top = 40.dp)
            .fillMaxWidth()
            .height(height = 100.dp)
            .background(color = colorResource(id = R.color.purple_200)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
            ){

        }

    }

}

