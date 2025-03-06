package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreens(modifier: Modifier = Modifier) {

    var nomeState = remember {
        mutableStateOf(value = "")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(
                listOf(
                    Color(0xFF080101),
                    Color(0xFFFF0000)

                )
            ))
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
                Image(
                    painter = painterResource(R.drawable.exercicio),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier
                        .padding(vertical = 60.dp)
                )
            Text(
            text = stringResource(R.string.welcome),
            fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(bottom = 60.dp)
        )

         Card (
             modifier = Modifier
                 .fillMaxSize()
                 .height(150.dp),
             shape = RoundedCornerShape(
                 topStart = 48.dp,
                 topEnd = 48.dp

             )

         ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column (
                    modifier = Modifier
                        .padding(top = 35.dp)
                        .padding(start = 35.dp)
                ){  }
                Text(
                    text = stringResource(R.string.your_name),
                    fontSize = 30.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 35.dp)
                        .padding(start = 35.dp)
                )
                OutlinedTextField(
                    value = nomeState.value,
                    onValueChange = {
                        nomeState.value = it
                    },
                    label = {
                        Text(text = "digite seu nome")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp),
                    leadingIcon = {
                        Icon(
                            ImageVector= Icons.Default.Email,
                            contentDescription = "",
                            tint = Color.Black
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "",
                            tint = Color.Black
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        capitalization = KeyboardCapitalization.Words
                    )
                )
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(top = 260.dp)
                        .padding(start = 250.dp)
                ){
                    Text(text = stringResource(R.string.next))
                    Icon(imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
            }

         }
        }
    }
}

fun Icon(ImageVector: ImageVector, contentDescription: String, tint: Color) {

}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreensPrieview() {
    HomeScreens()
}