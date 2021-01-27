package mx.tecnm.tepic.ntrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button6.setOnClickListener{
            var opcionSpinnner=spinner.selectedItemPosition
            when(opcionSpinnner){
                0->{
                    var cadena1="919";
                    var valorEntero=cadena1.toInt()
                    valorEntero+=1;
                    editTextResultado.setText("Conversion de cad a int: ${valorEntero}")

                }
                1->{
                    var cadena2="5.18"
                    var valorDoble= cadena2.toDouble()
                    valorDoble+=0.92
                    editTextResultado.setText("Conversion de cadena a doble: ${valorDoble}")
                }
                2->{
                    var decimal=29.8
                    var cadena3=decimal.toString()
                    cadena3="Conversion a decimal a cadena: "+cadena3
                    editTextResultado.setText(cadena3)


                }
                3->{
                    var entero= 915
                    var cadena4="Conversion Entero a cadena: "+entero.toString()

                    editTextResultado.setText(cadena4)

                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuconversion, menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.regresar ->{
                finish()
            }
            R.id.limpiar ->{
                editTextResultado.setText("")
                Toast.makeText(this,"Se Limpio el campo de texto", Toast.LENGTH_SHORT).show()
            }

        }
        return true
    }
}