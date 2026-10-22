package com.example.obrazzopisem;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView obrazmiejsce = findViewById(R.id.obraz);
    EditText editTextText = findViewById(R.id.editTextText);
    Button lewobutton = findViewById(R.id.lewobutton),prawobutton = findViewById(R.id.prawobutton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<ObrazZOpisem> obrazy = new ArrayList<>();
        ObrazZOpisem obraz1=new ObrazZOpisem(R.drawable.obraz1, "");
        ObrazZOpisem obraz2=new ObrazZOpisem(R.drawable.obraz2, "");
        ObrazZOpisem obraz3=new ObrazZOpisem(R.drawable.obraz3, "");
        ObrazZOpisem obraz4=new ObrazZOpisem(R.drawable.obraz4, "");

        obrazy.add(obraz1);
        obrazy.add(obraz2);
        obrazy.add(obraz3);
        obrazy.add(obraz4);

        wyswietlobraz(1);
    }

    public void wyswietlobraz(int obraznumer){
        obrazmiejsce.setImageResource(Integer.parseInt(obrazy[0]));
    }

}