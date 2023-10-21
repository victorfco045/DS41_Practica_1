package mx.edu.a22311091.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var temperatura: String = ""
    private var selectedoption: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado = findViewById<TextView>(R.id.textView)
        val option = findViewById<Spinner>(R.id.spinner)
        val temp = findViewById<EditText>(R.id.editTextNumberDecimal)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            temperatura = temp.text.toString()

            conversion(selectedoption)
        }

        if(option != null){

            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, resources.getStringArray(R.array.convert_options)
            )
            option.adapter=adapter

            option.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    TODO("Not yet implemented")
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }

    }
    private fun conversion(option:Int){
        when(option){

            0-> {
                //TODO Tarea: traer las formulas fisicas para convertir las temperaturas
            }
            0-> {

            }
            0-> {

            }
            0-> {

            }
            0-> {

            }
            0-> {

            }









        }
    }
}