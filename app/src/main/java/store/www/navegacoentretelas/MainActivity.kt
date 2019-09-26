package store.www.navegacoentretelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// configurando o botao da primeira tela para o evento de click


        Button.setOnClickListener {
            // criei uma variavel que recebe inteçao da chamada de outra tela no caso segunda tela

            val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent)
        }

    }
}
