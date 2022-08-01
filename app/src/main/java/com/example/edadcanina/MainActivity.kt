package com.example.edadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.edadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ageEdit=binding.ageEdit
        val resultText=binding.resultText
        val button=binding.button


        button.setOnClickListener {
            val ageString = ageEdit.text.toString()

            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()

                val result = ageInt * 7
                resultText.text = getString(R.string.result, result)
            }else{
                Toast.makeText(this,R.string.no_empty, Toast.LENGTH_SHORT).show()
                Log.d("MainActivity", "Age string esta VACIO")
            }

        }
    }
}