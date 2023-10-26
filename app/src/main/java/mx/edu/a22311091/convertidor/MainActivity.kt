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

    private var selectedoption: Int = 0
    private var result :Double = 0.0
    private var value: String = ""
    private lateinit var total: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val option = findViewById<Spinner>(R.id.spinner)
        val temp = findViewById<EditText>(R.id.editTextNumberDecimal)
        total = findViewById(R.id.result)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            value = temp.text.toString()

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
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                    selectedoption = position
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
                // °F = (°C × 9/5) + 32
                result = (value.toDouble() * 9/5 + 32)
                total.text = result.toString()
            }
            1-> {
                //K=°C + 273.15
                result = (value.toDouble() + 273.15)
                total.text = result.toString()

            }
            2-> {
                //°C=(°F−32) ×5/9
                result = (value.toDouble() - 32) * 5/9
                total.text = result.toString()

            }
            3-> {
                //K=(°F−32) × 5/ 9 + 273.15
                result = (value.toDouble() -32)*5/9 + 273.15
                total.text = result.toString()


            }
            4-> {
                //°C=K−273.15
                result = (value.toDouble() - 273.15)
                total.text = result.toString()
            }
            5-> {
                //°F=(K−273.15) × 9/5+32
                result = (value.toDouble() - 273.15) * 9/5+32
                total.text = result.toString()

            }









        }
    }
}