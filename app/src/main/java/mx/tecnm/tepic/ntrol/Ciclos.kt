package mx.tecnm.tepic.ntrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ciclos.*

class Ciclos : AppCompatActivity() {
    var cad=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclos)


        button5.setOnClickListener{
            finish()
        }
        button3.setOnClickListener{
            cad=""
            for(i in 1..100){
                cad+=i.toString()+" - ";

            }
                textView.setText(cad)
        }
        button4.setOnClickListener{
            cad=""
            var i=0
            while (i<=100){
                i+=2
                cad+=i.toString()+" - "

            }
            textView.setText(cad)

        }
    }

}