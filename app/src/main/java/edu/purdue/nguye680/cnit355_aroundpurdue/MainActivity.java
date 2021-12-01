package edu.purdue.nguye680.cnit355_aroundpurdue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] categories = { "Purdue", "Nature", "Restaurants", "Shopping", "Activities", "Exhibitions", "21+", "Cafes", "Chill"};
    String categorySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                categorySelected = categories[pos];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });
    }

    public void openDetailedPage(View view) {
        Intent mIntent = new Intent (this, GuideActivity.class);
        startActivity(mIntent);
    }

    public void openSavedPage(View view) {
        Intent mIntent = new Intent (this, SaveActivity.class);
        startActivity(mIntent);
    }
}