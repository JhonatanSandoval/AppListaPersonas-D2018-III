package com.miempresa.applistapersonas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.miempresa.applistapersonas.adapter.ListaPersonasAdapter;
import com.miempresa.applistapersonas.model.PersonaModel;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonasActivity extends AppCompatActivity {

    private RecyclerView rvPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personas);

        rvPersonas = findViewById(R.id.rvPersonas);

        // 1. administrador de diseño
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(ListaPersonasActivity.this);
        rvPersonas.setLayoutManager(layoutManager);

        // 2. adaptador
        ListaPersonasAdapter adapter =
                new ListaPersonasAdapter();
        rvPersonas.setAdapter(adapter);

        // 3. datos (lista de personas)
        adapter.setListaPersonas(obtenerListaPersonas());

    }

    private List<PersonaModel> obtenerListaPersonas() {
        List<PersonaModel> personas = new ArrayList<>();

        PersonaModel persona1 = new PersonaModel("Jhonatan Joel", "986 823 055");
        PersonaModel persona2 = new PersonaModel("Juan Tito", "999 747 665");
        PersonaModel persona3 = new PersonaModel("Maria Elizabeth", "978 645 382");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        return personas;
    }

}
