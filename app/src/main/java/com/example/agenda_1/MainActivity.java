package com.example.agenda_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText t1,t2,t3;
    private Button b1;
    private ListView l1;
    private List<String> mList = new ArrayList<>();
    private ArrayAdapter<String> mAdapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.txtNombre);
        t2 = findViewById(R.id.txtTelefono);
        t3 = findViewById(R.id.txtCorreo);

        b1 = findViewById(R.id.btnAgrega);
        b1.setOnClickListener(this);

        l1 = findViewById(R.id.lView);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAgrega:
                    String texto1 = t1.getText().toString().trim();
                    String texto2 = t2.getText().toString().trim();
                    String texto3 = t3.getText().toString().trim();
                    //mList.add(texto1,texto2);
                    //mList.add(texto1,texto2,texto3);
                    mList.add(texto1);
                    mList.add(texto2);
                    mList.add(texto3);
                    t1.getText().clear();
                    t2.getText().clear();
                    t3.getText().clear();
                    mAdapterList = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mList);
                    l1.setAdapter(mAdapterList);
        }

    }
}