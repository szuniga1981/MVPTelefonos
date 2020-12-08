package cl.sebastian.mvptelefonos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
Requerimientos
[] MVP
[]Data Binding
[]RetroFit (API)
[]RecyclerView
[] Fragmentos

Tareas por hacer
4.[] Crear clase modelo
    *POJO
    *RetroFitClient
[] Crear clase View ()
5.[] crear clase Presenter()
    *Interfaz Presenter
1.[] Activar Data Bindindig()
2.[] Implementar Retrofit - RecyclerView()
6.[] clase adapter, viewholder,reciclerView
3.[] Layout
    *Instanciar databinding()
    *configurar databinding()
[] Enlazar vista con presentador()

 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}