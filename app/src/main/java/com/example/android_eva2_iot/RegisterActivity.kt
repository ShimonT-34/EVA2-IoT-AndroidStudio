package com.example.android_eva2_iot

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etUser = findViewById<EditText>(R.id.etUser)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val user = etUser.text.toString()
            val email = etEmail.text.toString()
            val pass = etPass.text.toString()

            if (user.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("Registro exitoso")
                    .setMessage("El usuario '$user' ha sido registrado.")
                    .setPositiveButton("OK") { _, _ ->
                        finish() // vuelve al login
                    }
                    .show()
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Campos vacíos")
                    .setMessage("Por favor, completa todos los campos antes de registrar.")
                    .setPositiveButton("OK", null)
                    .show()
            }
        }
    }
}
