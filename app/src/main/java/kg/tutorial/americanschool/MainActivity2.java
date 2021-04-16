package kg.tutorial.americanschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
    TextView textServiceLanguage;
    TextView textServiceTitle;
    ImageView image_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textServiceLanguage = findViewById(R.id.service_language);
        textServiceTitle = findViewById(R.id.title_courses);
        image_1 = findViewById(R.id.image_one);

        int text1 = getIntent().getIntExtra("title", 0);
        textServiceTitle.setText(text1);
        int text = getIntent().getIntExtra("descr", 0);
        textServiceLanguage.setText(text);
        int image = getIntent().getIntExtra("image",0);
        image_1.setImageResource(image);
        }
    }
