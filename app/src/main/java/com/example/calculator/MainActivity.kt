package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        var etName=findViewById<EditText>(R.id.etnumber);
        var etdot=findViewById<EditText>(R.id.etnumber2);
        var btnsum =findViewById<Button>(R.id.btnadd)
        var btnsub=findViewById<Button>(R.id.btnsub);
        var btnmulty =findViewById<Button>(R.id.btnmutiply)
        var btnmodulus=findViewById<Button>(R.id.btnmodulus);
        var tvresult=findViewById<TextView>(R.id.tvtotal)
        btnsum.setOnClickListener {
            var name=etName.text.toString().toInt()
            var dot=etdot.text.toString().toInt()
            var add=name+dot
            tvresult.setText(add.toString())

        }
        btnsub.setOnClickListener {
            var name=etName.text.toString().toInt()
            var dot=etdot.text.toString().toInt()
            var sub=name-dot
            tvresult.setText(sub.toString())

        }
        btnmulty.setOnClickListener {
            var name=etName.text.toString().toInt()
            var dot=etdot.text.toString().toInt()
            var mutiply=name*dot
            tvresult.setText(mutiply.toString())

        }
        btnmodulus.setOnClickListener {
            var name=etName.text.toString().toInt()
            var dot=etdot.text.toString().toInt()
            var modulus=name%dot
            tvresult.setText(modulus.toString())

        }

    }
}

