package com.frunaos.appaustral;

import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ScrollingActivity_InfoPlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling__info_place);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("ciudad");


        CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        if(dato.equals("Puerto Montt")){
            toolbarLayout.setBackgroundResource(R.drawable.pm);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Pelluco")){
            toolbarLayout.setBackgroundResource(R.drawable.pelluco);
            toolbarLayout.setTitle(dato);

        }
        if(dato.equals("Pelluhuin")){
            toolbarLayout.setBackgroundResource(R.drawable.pelluhuin);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Coihuin")){
            toolbarLayout.setBackgroundResource(R.drawable.coihuin);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Chamiza")){
            toolbarLayout.setBackgroundResource(R.drawable.chamiza);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Piedra Azul")){
            toolbarLayout.setBackgroundResource(R.drawable.piedraazul);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("PichiQuillaipe")){
            toolbarLayout.setBackgroundResource(R.drawable.pichiquillaipe);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Quillaipe")){
            toolbarLayout.setBackgroundResource(R.drawable.quillaipe);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Metri")){
            toolbarLayout.setBackgroundResource(R.drawable.metri);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Lenca")){
            toolbarLayout.setBackgroundResource(R.drawable.lenca);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Chaicas")){
            toolbarLayout.setBackgroundResource(R.drawable.chaicas);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Caleta Gutierrez")){
            toolbarLayout.setBackgroundResource(R.drawable.caletagutierrez);
            toolbarLayout.setTitle(dato);
        }
        if(dato.equals("Caleta la Arena")){
            toolbarLayout.setBackgroundResource(R.drawable.caletalaarena);
            toolbarLayout.setTitle(dato);
        }




    }
}
