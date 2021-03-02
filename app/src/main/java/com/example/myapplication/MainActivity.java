package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sendMessage(v);
            }
        });
    }

    public void sendMessage(View v){
        EditText text = findViewById(R.id.editTextTextPersonName);
        String mensaje = text.getText().toString();
        Intent intent = new Intent(this,RecibirMensaje.class);
        intent.putExtra(RecibirMensaje.EXTRA_MESSAGE,mensaje);
        startActivity(intent);
    }
}