package kg.tutorial.americanschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout serviceLanguage;
    private ConstraintLayout serviceSummerCamp;
    private ConstraintLayout serviceTalkingClub;
    private ConstraintLayout serviceToefl;
    private TextView callBtn;
    private ConstraintLayout banner;
    int x = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceLanguage = findViewById(R.id.service_language);
        serviceSummerCamp = findViewById(R.id.service_summer_camp);
        serviceTalkingClub = findViewById(R.id.service_talking_club);
        serviceToefl = findViewById(R.id.service_toefl);
        callBtn = findViewById(R.id.call_button);
        banner = findViewById(R.id.banner);

        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://google.com";
                Uri myUri = Uri.parse(link);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(myIntent);
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "+996555500500";
                Uri myUri = Uri.parse("tel:" + number);
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);
            }
        });

        serviceLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_language,
                        R.drawable.image_1,
                        R.string.service_language_descr
                );
            }
        });
        serviceSummerCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_camp,
                        R.drawable.image_2,
                        R.string.service_camp_descr

                );
            }
        });
        serviceTalkingClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_talking,
                        R.drawable.image_2,
                        R.string.service_talking_descr
                );
            }
        });
        serviceToefl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_toefl,
                        R.drawable.image_3,
                        R.string.service_toefl_descr
                );

            }
        });


    }
    private void startInfoActivity(int titleRes, int imageRes, int descrRes){
        Intent myIntent = new Intent(this, MainActivity2.class);
        myIntent.putExtra("title", "titleRes");
        myIntent.putExtra("image", "imageRes");
        myIntent.putExtra("descr", "descrRes");
        startActivity(myIntent);

    }
}