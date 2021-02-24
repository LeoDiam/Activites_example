package com.example.activites_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LIFE_CYCLE", "MainActivity - onCreate");

        EditText editText = findViewById(R.id.edTxt);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BUTTON", "You click a button");
                String text = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("myText", text);
                intent.putExtra("other", "this is some text");

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFE_CYCLE", "MainActivity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFE_CYCLE", "MainActivity - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFE_CYCLE", "MainActivity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFE_CYCLE", "MainActivity - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFE_CYCLE", "MainActivity - onDestroy");
    }
}