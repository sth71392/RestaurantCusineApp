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
        if(cuisineType.equals("Chinese")){
            cuisineInfo.setText(getResources().getString(R.string.chineseInfo));
        }else if(cuisineType.equals("Mexican")){
            cuisineInfo.setText(getResources().getString(R.string.mexicanInfo));
        }else if(cuisineType.equals("Thai")){
            cuisineInfo.setText(getResources().getString(R.string.thaiInfo));
        }else if(cuisineType.equals("Japanese")){
            cuisineInfo.setText(getResources().getString(R.string.japaneseInfo));
        }else if(cuisineType.equals("American")){
            cuisineInfo.setText(getResources().getString(R.string.americanInfo));
        }

    }
}
