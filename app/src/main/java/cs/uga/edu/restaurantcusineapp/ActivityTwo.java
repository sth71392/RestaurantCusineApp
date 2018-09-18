package cs.uga.edu.restaurantcusineapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private TextView cuisineInfo;
    private ImageView cuisineImage;
    private Button backCuisine;
    private String cuisineType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent intent = getIntent();
        cuisineType = intent.getStringExtra("cuisine");
        cuisineInfo = (TextView) findViewById(R.id.cuisineInfo);
        cuisineImage = (ImageView) findViewById(R.id.cuisineImage);
        if(cuisineType.equals("Chinese")){
            cuisineInfo.setText(getResources().getString(R.string.chineseInfo));
            cuisineInfo.getLayoutParams().height = 6700;
            cuisineImage.setImageDrawable(getResources().getDrawable(R.drawable.chinese));
        }else if(cuisineType.equals("Mexican")){
            cuisineInfo.setText(getResources().getString(R.string.mexicanInfo));
            cuisineInfo.getLayoutParams().height = 7000;
            cuisineImage.setImageDrawable(getResources().getDrawable(R.drawable.mexican));
        }else if(cuisineType.equals("Thai")){
            cuisineInfo.setText(getResources().getString(R.string.thaiInfo));
            cuisineInfo.getLayoutParams().height = 4200;
            cuisineImage.setImageDrawable(getResources().getDrawable(R.drawable.thai));
        }else if(cuisineType.equals("Japanese")){
            cuisineInfo.setText(getResources().getString(R.string.japaneseInfo));
            cuisineInfo.getLayoutParams().height = 5300;
            cuisineImage.setImageDrawable(getResources().getDrawable(R.drawable.japanese));
            cuisineImage.getLayoutParams().height = 600;
        }else if(cuisineType.equals("American")){
            cuisineInfo.setText(getResources().getString(R.string.americanInfo));
            cuisineInfo.getLayoutParams().height = 8200;
            cuisineImage.setImageDrawable(getResources().getDrawable(R.drawable.american));
        }

        backCuisine = (Button) findViewById(R.id.backCuisine);
        backCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityOne();
            }
        });

    }

    public void openActivityOne(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
