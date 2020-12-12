package com.example.patientdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitfun(view: View) {
        var getPnme=findViewById<EditText>(R.id.pname)
        var getDnme=findViewById<EditText>(R.id.dname)
        var getSym=findViewById<EditText>(R.id.symptom)
        Toast.makeText(this,getPnme.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getDnme.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getSym.text.toString(),Toast.LENGTH_SHORT).show()
    }
    fun resetfun(view: View) {
        var getPnme=findViewById<EditText>(R.id.pname)
        var getDnme=findViewById<EditText>(R.id.dname)
        var getSym=findViewById<EditText>(R.id.symptom)
        getPnme.getText().clear()
        getDnme.getText().clear()
        getSym.getText().clear()
    }
}