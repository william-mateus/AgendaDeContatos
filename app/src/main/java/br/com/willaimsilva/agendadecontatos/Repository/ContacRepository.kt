package br.com.willaimsilva.agendadecontatos.Repository

import android.provider.ContactsContract
import br.com.willaimsilva.agendadecontatos.model.Contact

class ContacRepository {
    private val contacts:List<Contact> = listOf(
        Contact( "fulano","12345678"),
        Contact("ciclano","12345678"),
        Contact("beotrano","87654321"),
        Contact("João","12345678"),
        Contact("maria","12345678")
    )

    fun findAll():List<Contact>{
        return this.contacts;
    }
}