package cs.uga.edu.restaurantcusineapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private TextView cuisineInfo;
    private String cuisineType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent intent = getIntent();
        cuisineType = intent.getStringExtra("cuisine");
        cuisineInfo = (TextView) findViewById(R.id.cuisineInfo);
        cuisineInfo.setText(cuisineType);
    }
}
