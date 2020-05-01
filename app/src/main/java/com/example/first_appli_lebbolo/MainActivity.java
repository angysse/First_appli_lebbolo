package com.example.first_appli_lebbolo;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.first_appli_lebbolo.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1); //création de l'objt spinner avec pour id : spinner1
        ArrayAdapter<CharSequence> adapter  =  ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_item); // objet de type array dapater, avec pour nom array, il va chercher dans la liste city du string.xml
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) { //cette methode permet lorsque l'on clique sur un element de la liste d'afficher ce  à quoi correspond la méthode (ici en loccurence un toast)
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
