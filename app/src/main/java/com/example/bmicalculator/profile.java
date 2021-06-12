package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    public Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        textView = findViewById(R.id.textView5);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubutton, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.bmi) {
            Intent intent = new Intent(profile.this, MainActivity.class);
            startActivity(intent);
            return true;
        }

        else if (id == R.id.profile) {
            Intent intent = new Intent(profile.this, profile.class);
            startActivity(intent);
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

}