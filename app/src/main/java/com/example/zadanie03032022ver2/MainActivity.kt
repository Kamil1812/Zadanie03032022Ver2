package com.example.zadanie03032022ver2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var Margarita: CheckBox
    lateinit var Roma: CheckBox
    lateinit var Salami: CheckBox

    lateinit var La_Qura: CheckBox
    lateinit var Serowa: CheckBox
    lateinit var Pepperoni: CheckBox

    lateinit var mala: CheckBox
    lateinit var srednia: CheckBox
    lateinit var duza: CheckBox

    lateinit var Ketchup: CheckBox
    lateinit var Czosnkowy: CheckBox
    lateinit var Meksykanski: CheckBox

    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        Margarita = findViewById(R.id.checkBox1)
        Roma = findViewById(R.id.checkBox2)
        Salami = findViewById(R.id.checkBox3)
        La_Qura = findViewById(R.id.checkBox)
        Serowa = findViewById(R.id.checkBox4)
        Pepperoni = findViewById(R.id.checkBox5)

        mala = findViewById(R.id.checkBox8)
        srednia = findViewById(R.id.checkBox7)
        duza = findViewById(R.id.checkBox6)

        Ketchup = findViewById(R.id.checkBox11)
        Czosnkowy = findViewById(R.id.checkBox10)
        Meksykanski = findViewById(R.id.checkBox9)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (Margarita.isChecked) {
                result.append("\nMargarita 20 zł")
                totalAmount += 20
            }
            if (Salami.isChecked) {
                result.append("\nSalami 22 zł")
                totalAmount += 22
            }
            if (Roma.isChecked) {
                result.append("\nRoma 23 zł")
                totalAmount += 23
            }
            if (Serowa.isChecked) {
                result.append("\nSerowa 20 zł")
                totalAmount += 20
            }
            if (Pepperoni.isChecked) {
                result.append("\nPepperoni 23 zł")
                totalAmount += 25
            }
            if (La_Qura.isChecked) {
                result.append("\nLa Qura 26 zł")
                totalAmount += 26
            }
            if (mala.isChecked) {
                result.append("\nMała 2 zł")
                totalAmount += 2
            }
            if (srednia.isChecked) {
                result.append("\nŚrednia 3 zł")
                totalAmount += 3
            }
            if (duza.isChecked) {
                result.append("\nDuża 4 zł")
                totalAmount += 4
            }
            if (Ketchup.isChecked) {
                result.append("\nKetchup 1 zł")
                totalAmount += 1
            }
            if (Czosnkowy.isChecked) {
                result.append("\nCzosnkowy 1 zł")
                totalAmount += 1
            }
            if (Meksykanski.isChecked) {
                result.append("\nMeksykanski 1 zł")
                totalAmount += 1
            }
            result.append("\nDo zapłaty: " + totalAmount + "zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}