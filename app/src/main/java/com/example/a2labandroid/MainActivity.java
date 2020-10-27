package com.example.a2labandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import static com.example.a2labandroid.R.array.selection_options;


public class MainActivity extends AppCompatActivity {

    private Spinner spCounterOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    this.spCounterOption = findViewById(R.id.spCounterOption);

      ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, selection_options, android.R.layout.simple_spinner_item);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      this.spCounterOption.setAdapter(adapter);



    }

    public void btnSelection(View view) {
        Toast.makeText(this, this.spCounterOption.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        if(this.spCounterOption.getSelectedItem().toString().equalsIgnoreCase(getString(R.string.selection_chars)))
        {

        }
    }
}