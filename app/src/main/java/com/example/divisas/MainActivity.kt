package com.example.divisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.divisas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val divisas1 = binding.divisas1
        val divisas2 = binding.divisas2
        val lista = resources.getStringArray(R.array.divisas)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        var posiciondivi1 = ""
        var posiciondivi2 = ""
        val cantidad = binding.ingcanti1
        val resultado = binding.resultado
        var total = 0.0

        divisas1.adapter = adapter
        divisas2.adapter = adapter

        divisas1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                posiciondivi1 = lista[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "Error altraer divisas", Toast.LENGTH_LONG).show()
            }

        }

        divisas2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                posiciondivi2 = lista[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "Error altraer divisas", Toast.LENGTH_LONG).show()
            }
        }

        binding.convertir.setOnClickListener {
            if (cantidad.text.isNotEmpty()) {
                when (posiciondivi1) {
                    "Bitcoin" -> {
                        when (posiciondivi2) {
                            "Bitcoin" -> {
                                resultado.text = cantidad.text
                            }
                            "Dolares" -> {
                                total = cantidad.text.toString().toFloat() * 24251.70
                                resultado.text = total.toString()
                            }
                            "Lempiras" -> {
                                total = cantidad.text.toString().toFloat() * 594422.99
                                resultado.text = total.toString()
                            }
                            "Quetzales" -> {
                                total = cantidad.text.toString().toFloat() * 188698.48
                                resultado.text = total.toString()
                            }
                            "Cordobas" -> {
                                total = cantidad.text.toString().toFloat() * 881149.63
                                resultado.text = total.toString()
                            }
                            "Colones Costaricenses" -> {
                                total = cantidad.text.toString().toFloat() * 13486178.78
                                resultado.text = total.toString()
                            }
                        }
                    }
                    "Dolares" -> {
                        when (posiciondivi2) {
                            "Dolares" -> {
                                resultado.text = cantidad.text
                            }
                            "Bitcoin" -> {
                                total = cantidad.text.toString().toFloat() * 0.000041
                                resultado.text = total.toString()
                            }
                            "Lempiras" -> {
                                total = cantidad.text.toString().toFloat() * 24.51
                                resultado.text = total.toString()
                            }
                            "Quetzales" -> {
                                total = cantidad.text.toString().toFloat() * 7.78
                                resultado.text = total.toString()
                            }
                            "Cordobas" -> {
                                total = cantidad.text.toString().toFloat() * 36.33
                                resultado.text = total.toString()
                            }
                            "Colones Costaricenses" -> {
                                total = cantidad.text.toString().toFloat() * 556.09
                                resultado.text = total.toString()
                            }
                        }
                    }
                    "Lempiras" -> {
                        when (posiciondivi2) {
                            "Lempiras" -> {
                                resultado.text = cantidad.text
                            }
                            "Bitcoin" -> {
                                total = cantidad.text.toString().toFloat() * 0.0000017
                                resultado.text = total.toString()
                            }
                            "Dolares" -> {
                                total = cantidad.text.toString().toFloat() * 0.041
                                resultado.text = total.toString()
                            }
                            "Quetzales" -> {
                                total = cantidad.text.toString().toFloat() * 0.32
                                resultado.text = total.toString()
                            }
                            "Cordobas" -> {
                                total = cantidad.text.toString().toFloat() * 1.48
                                resultado.text = total.toString()
                            }
                            "Colones Costaricenses" -> {
                                total = cantidad.text.toString().toFloat() * 22.70
                                resultado.text = total.toString()
                            }
                        }
                    }
                    "Quetzales" -> {
                        when (posiciondivi2) {
                            "Quetzales" -> {
                                resultado.text = cantidad.text
                            }
                            "Bitcoin" -> {
                                total = cantidad.text.toString().toFloat() * 0.0000053
                                resultado.text = total.toString()
                            }
                            "Dolares" -> {
                                total = cantidad.text.toString().toFloat() * 0.13
                                resultado.text = total.toString()
                            }
                            "Lempiras" -> {
                                total = cantidad.text.toString().toFloat() * 3.15
                                resultado.text = total.toString()
                            }
                            "Cordobas" -> {
                                total = cantidad.text.toString().toFloat() * 4.67
                                resultado.text = total.toString()
                            }
                            "Colones Costaricenses" -> {
                                total = cantidad.text.toString().toFloat() * 71.44
                                resultado.text = total.toString()
                            }
                        }
                    }
                    "Cordobas" -> {
                        when (posiciondivi2) {
                            "Cordobas" -> {
                                resultado.text = cantidad.text
                            }
                            "Bitcoin" -> {
                                total = cantidad.text.toString().toFloat() * 0.0000011
                                resultado.text = total.toString()
                            }
                            "Dolares" -> {
                                total = cantidad.text.toString().toFloat() * 0.028
                                resultado.text = total.toString()
                            }
                            "Lempiras" -> {
                                total = cantidad.text.toString().toFloat() * 0.67
                                resultado.text = total.toString()
                            }
                            "Quetzales" -> {
                                total = cantidad.text.toString().toFloat() * 0.21
                                resultado.text = total.toString()
                            }
                            "Colones Costaricenses" -> {
                                total = cantidad.text.toString().toFloat() * 15.31
                                resultado.text = total.toString()
                            }
                        }
                    }
                    "Colones Costaricenses" -> {
                        when (posiciondivi2) {
                            "Colones Costaricenses" -> {
                                resultado.text = cantidad.text
                            }
                            "Bitcoin" -> {
                                total = cantidad.text.toString().toFloat() * 0.00000007
                                resultado.text = total.toString()
                            }
                            "Dolares" -> {
                                total = cantidad.text.toString().toFloat() * 0.0018
                                resultado.text = total.toString()
                            }
                            "Lempiras" -> {
                                total = cantidad.text.toString().toFloat() * 0.044
                                resultado.text = total.toString()
                            }
                            "Quetzales" -> {
                                total = cantidad.text.toString().toFloat() * 0.014
                                resultado.text = total.toString()
                            }
                            "Cordobas" -> {
                                total = cantidad.text.toString().toFloat() * 0.065
                                resultado.text = total.toString()
                            }
                        }
                    }
                }


                }else{
                    Toast.makeText(
                        this@MainActivity,
                        "Ingrese un valor en las divisas",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

        }
}
