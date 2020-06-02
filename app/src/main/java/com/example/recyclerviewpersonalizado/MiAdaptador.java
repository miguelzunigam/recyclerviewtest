package com.example.recyclerviewpersonalizado;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter <MiAdaptador.Llenar> {

    ArrayList<Tarjetas_alumnos> misAlumnos;

    public MiAdaptador(ArrayList<Tarjetas_alumnos> misAlumnos) {
        this.misAlumnos = misAlumnos;
    }

    @NonNull
    @Override
    public MiAdaptador.Llenar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_alumno,null,false);
        return new Llenar(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.Llenar holder, int position) {
        holder.NomAlumno.setText(misAlumnos.get(position).getNombre());
        holder.CuentaAlumno.setText(misAlumnos.get(position).getCuenta());
        holder.FotoAlumno.setImageResource(misAlumnos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return misAlumnos.size();
    }

    public class Llenar extends RecyclerView.ViewHolder {
        TextView NomAlumno, CuentaAlumno;
        ImageView FotoAlumno;
        public Llenar(@NonNull View itemView) {
            super(itemView);
            NomAlumno=(TextView) itemView.findViewById(R.id.textViewNombreAlumno);
            CuentaAlumno=(TextView) itemView.findViewById(R.id.textViewNumCuenta);
            FotoAlumno=(ImageView) itemView.findViewById(R.id.imageViewFotoAlumno);
        }
    }
}
