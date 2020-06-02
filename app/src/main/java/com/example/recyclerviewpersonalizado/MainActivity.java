package com.example.recyclerviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerViewAlumnos;
    public Button boton;
    ArrayList<Tarjetas_alumnos> alumnosArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alumnosArrayList=new ArrayList<>();
        llenarAlumnos();

        //Recordar como se ligan los elementos gráficos con su métodos....
        boton=(Button)findViewById(R.id.buttonAccion);

        //Ligar el recyclerView
        recyclerViewAlumnos=(RecyclerView)findViewById(R.id.recyclerViewAlumnos);

        //Seleccionamos el tipo de vista (this=seleccionando la vista de lista
        recyclerViewAlumnos.setLayoutManager(new LinearLayoutManager(this));

        //Rellenar la información
        MiAdaptador miAdaptador = new MiAdaptador(alumnosArrayList);
        recyclerViewAlumnos.setAdapter(miAdaptador);


    }

    private void llenarAlumnos() {
        alumnosArrayList.add(new Tarjetas_alumnos("Miguel Angel",
                "007",R.drawable.fotoalumno));
        alumnosArrayList.add(new Tarjetas_alumnos("Carlos ",
                "000112223",R.drawable.gato2));
        alumnosArrayList.add(new Tarjetas_alumnos("Yoda",
                "000",R.drawable.yoda));

    }
}
