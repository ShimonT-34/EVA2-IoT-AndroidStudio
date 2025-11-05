package com.example.android_eva2_iot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.etUser)
        val pass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRecover = findViewById<Button>(R.id.btnRecover)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            val username = user.text.toString().trim()
            val password = pass.text.toString().trim()

            when {
                username.isEmpty() -> {
                    user.error = "Ingrese su usuario o email"
                    user.requestFocus()
                }
                password.isEmpty() -> {
                    pass.error = "Ingrese su contraseña"
                    pass.requestFocus()
                }
                else -> {
                    // Login exitoso
                    AlertDialog.Builder(this)
                        .setTitle("Inicio de sesión")
                        .setMessage("Bienvenido, $username.")
                        .setPositiveButton("OK", null)
                        .show()
                }
            }
        }

        btnRecover.setOnClickListener {
            startActivity(Intent(this, RecoverActivity::class.java))
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}