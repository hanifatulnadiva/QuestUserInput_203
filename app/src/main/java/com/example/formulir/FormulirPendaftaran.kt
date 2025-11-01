package com.example.formulir

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            Text(text= stringResource(id = R.string.judul),
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White
            )
        }
        Box(modifier= Modifier
            .fillMaxWidth()
            .background(color = colorResource(id=R.color.ungu_muda))
        ){
            Card(
                modifier = Modifier
                    .padding(all = 25.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id=R.color.white)
                )
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(text = stringResource(id=R.string.nama))
                    OutlinedTextField(
                        value = textNama,
                        onValueChange = { textNama = it },
                        label = { Text("Isi nama lengkap") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(text = stringResource(id=R.string.jenis_kelamin))
                    Column {
                        gender.forEach { item ->
                            Row (modifier= Modifier .selectable(
                                selected = textJK == item,
                                onClick = {textJK = item}
                            ), verticalAlignment = Alignment.CenterVertically){
                                RadioButton(
                                    selected = textJK == item,
                                    onClick = {
                                        textJK=item
                                    }
                                )
                                Text(text = item)
                            }
                        }
                    }
                }

            }
        }

    }

}

