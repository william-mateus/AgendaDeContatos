package br.com.willaimsilva.agendadecontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.willaimsilva.agendadecontatos.Repository.ContacRepository
import org.w3c.dom.Text

class ContactAdapter:RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    private val user=(ContacRepository()).findAll()

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var tvNome:TextView= itemView.findViewById(R.id.tvName)
        var tvPhone:TextView=itemView.findViewById(R.id.tvPhone)
    }
            // infla o layout "gera objeto"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
     return ViewHolder(view)
            }
          //  vincula os objetos
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNome.text= user[position].nome
        holder.tvPhone.text=user[position].phone
    }

          // aqui é declarado quantas vezes ele chama o objeto
    override fun getItemCount(): Int = user.size


}