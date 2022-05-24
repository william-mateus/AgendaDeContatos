package br.com.willaimsilva.agendadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.willaimsilva.agendadecontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rcContacts.adapter = ContactAdapter()
        binding.rcContacts.layoutManager =LinearLayoutManager(applicationContext)
    }
}