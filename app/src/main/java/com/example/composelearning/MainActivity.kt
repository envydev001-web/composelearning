package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearning.ui.theme.ComposelearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposelearningTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    LoginScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email = remember {
        mutableListOf(" ")
    }
    var passowrd = remember {
        mutableListOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Screen",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = email[0],
            onValueChange = { email[0] = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxSize()


        )
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedTextField(
            value = passowrd[0],
            onValueChange = { passowrd[0] = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxSize()
        )

        Spacer(modifier = Modifier.padding(8.dp))
        Button(onClick = {

        }, modifier = Modifier.fillMaxSize()) {
            Text("Login")
        }


    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposelearningTheme {
        Greeting("Android")
    }
}