package cs.uga.edu.restaurantcusineapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button cuisineInfo;
    private Button restaurants;
    private String cuisineType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner setup with custom choices like Chinese and Mexcican
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cuisines, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //button listeners for information responses
        cuisineInfo = (Button) findViewById(R.id.cuisineInfo);
        cuisineInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTwo();
            }
        });
        restaurants = (Button) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityThree();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        cuisineType = parent.getItemAtPosition(position).toString();
    }//get choice from spinner as string

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //open activities with intent and sending data (cuisine choice) to next activity
    public void openActivityTwo(){
        Intent intent = new Intent(this, ActivityTwo.class);
        intent.putExtra("cuisine", cuisineType);
        startActivity(intent);
    }

    //method for intent and starting activity
    public void openActivityThree(){
        Intent intent = new Intent(this, ActivityThree.class);
        intent.putExtra("cuisine", cuisineType);
        startActivity(intent);
    }
    
}
