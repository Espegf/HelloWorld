package com.example.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btHello.setOnClickListener {mensajeSaludo()}

        val bt_hello: Button
        bt_hello = findViewById(R.id.bt_hello)
        bt_hello.setOnClickListener{mensajeSaludo()}
    }

    private fun mensajeSaludo(){
        val et_name: EditText
        et_name = findViewById(R.id.ptName)
        if (et_name.text.toString().isEmpty()){
            Toast.makeText(this, "I need your name", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Hi ${et_name.text}!!", Toast.LENGTH_SHORT).show()
        }
    }
}