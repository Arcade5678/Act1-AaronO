package com.example.act1_aarono

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.act1_aarono.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botó per imprimir a Logcat
        binding.buttonLogcat.setOnClickListener {
            Log.d("ThirdActivity", getString(R.string.missatge_logcat))
        }

        // Botó per mostrar Toast
        binding.buttonToast.setOnClickListener {
            Toast.makeText(this, getString(R.string.missatge_toast), Toast.LENGTH_SHORT).show()
        }
    }
}