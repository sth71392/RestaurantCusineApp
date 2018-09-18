package cs.uga.edu.restaurantcusineapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityThree extends AppCompatActivity {

    private TextView restaurantInfo;
    private String cuisineType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Intent intent = getIntent();
        cuisineType = intent.getStringExtra("cuisine");
        restaurantInfo = (TextView) findViewById(R.id.restaurants);

        if(cuisineType.equals("Chinese")){
            restaurantInfo.setText(getResources().getString(R.string.chineseRestaurants));
        }else if(cuisineType.equals("Mexican")){
            restaurantInfo.setText(getResources().getString(R.string.mexicanRestaurants));
        }else if(cuisineType.equals("Thai")){
            restaurantInfo.setText(getResources().getString(R.string.thaiRestaurants));
        }else if(cuisineType.equals("Japanese")){
            restaurantInfo.setText(getResources().getString(R.string.japaneseRestaurants));
        }else if(cuisineType.equals("American")){
            restaurantInfo.setText(getResources().getString(R.string.americanRestaurants));
        }

    }
}
