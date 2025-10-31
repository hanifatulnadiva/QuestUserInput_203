package com.example.formulir.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun FormulirPendaftaran(modifier: Modifier){
    var textNama by remember { mutableStateOf(value="") }
    var textJK by remember { mutableStateOf(value="") }
    var textStatus by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf(value="") }

}

