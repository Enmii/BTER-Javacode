package com.example.bterjavacode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class inputLocation extends AppCompatActivity {

    EditText sourceNode;
    EditText targetNode;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_location);
        Button SR = findViewById(R.id.shortestRoute);
        Button CR = findViewById(R.id.cheapestRoute);
        Button VM = findViewById(R.id.viewMap);

        sourceNode = (EditText)findViewById(R.id.sourceNode);
        targetNode = (EditText)findViewById(R.id.targetNode);
        textView5 = (TextView)findViewById(R.id.textView5);

        Editable s = sourceNode.getText();
        Editable t = targetNode.getText();

        //Startup python module
        if(!Python.isStarted()){
            Python.start(new AndroidPlatform(this));
        }
        Python py = Python.getInstance();
        //Call AStarAlgorithm.py
        final PyObject aStar = py.getModule("AStarAlgorithm");
        final PyObject cheapest = py.getModule("CheapestPath");

        SR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call main method of AStarAlgorithm.py
                PyObject obj = aStar.callAttr("main", s.toString(), t.toString());

                textView5.setText("Shortest Path Found w/ distance: " + obj.toString());
            }
        });
        CR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                PyObject obj = cheapest.callAttr("main", s.toString(), t.toString());

                textView5.setText("Cheapest Path Found w/ calculated fare: "+ obj.toString());
            }
        });
        VM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call main method of AStarAlgorithm.py
                viewMap();
            }
        });
    }

    public void openoptimizingRoute(){
        Intent intent = new Intent(this, optimizingRoute.class);
        startActivity(intent);
    }
    public void viewMap(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}