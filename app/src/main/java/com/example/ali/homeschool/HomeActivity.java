package com.example.ali.homeschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {
 WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        //ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Button Signup = (Button) findViewById(R.id.Signin);
       // GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(Signup);
       // Glide.with(this).load(R.drawable.hello).into(imageViewTarget);

        Button Signin = (Button) findViewById(R.id.Register);
       // GlideDrawableImageViewTarget imageViewTarget1 = new GlideDrawableImageViewTarget(Signin);
       // Glide.with(this).load(R.drawable.hello).into(imageViewTarget1);

        Button Guest = (Button) findViewById(R.id.Guest);



        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getBaseContext() , Register.class));

            }
        });

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getBaseContext() , Sign_In.class));

            }
        });
        Guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Guest.class);
                intent.putExtra("type",0);

                startActivity(intent);

            }
        });
    }
}
