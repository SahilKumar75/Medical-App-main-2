package com.example.musical.presentation.accounts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musical.R


@Composable
fun AccountView(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(){
                Icon(imageVector= Icons.Default.AccountCircle ,
                    contentDescription = "Account",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Column {
                    Text("Sahil K Singh")
                    Text("@sahilsnowbyte")
                }
            }
            IconButton(onClick = {}){
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight
                    , contentDescription = null)
            }
        }

        Row(modifier = Modifier.padding(top = 16.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_medical_services_24),
                contentDescription = "Ongoing treatment",
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = "Ongoing treatment")
        }
        Divider()

    }
}