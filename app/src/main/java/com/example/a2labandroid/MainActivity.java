package com.example.a2labandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.util.Log;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {

    private Spinner spCounterOption;
    private EditText edEnteredText;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onCreate =>");

    this.spCounterOption = findViewById(R.id.spCounterOption);
    this.edEnteredText = findViewById(R.id.edEnteredText);
    this.tvResult = findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      this.spCounterOption.setAdapter(adapter);



    }

    public void btnSelectionClick(View view) {
        Toast.makeText(this, this.spCounterOption.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

        String spSelectedOption = this.spCounterOption.getSelectedItem().toString();
        String charString = getString(R.string.selection_chars);

        if(spSelectedOption.equalsIgnoreCase(charString))
        {
            String enteredUserText = this.edEnteredText.getText().toString();
            int charsCount = tCounter.getCharsCount(enteredUserText);

            this.tvResult.setText(String.valueOf(charsCount));
        }
        else
        {
            Toast.makeText(this, "Not implemented", Toast.LENGTH_SHORT);
        }
    }
}