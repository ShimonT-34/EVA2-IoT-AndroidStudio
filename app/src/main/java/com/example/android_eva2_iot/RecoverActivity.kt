package com.example.android_eva2_iot

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RecoverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover)

        val email = findViewById<EditText>(R.id.etMail)
        val btnRecover = findViewById<Button>(R.id.btnRecover)

        btnRecover.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Recuperar clave")
                .setMessage("Se ha enviado un correo a ${email.text}.")
                .setPositiveButton("OK") { _, _ -> finish() }
                .show()
        }
    }
}
