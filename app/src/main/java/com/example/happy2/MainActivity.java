package com.example.happy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//   ImageView bdi_img;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        bdi_img = findViewById(R.id.image_bdi);
//        bdi_img.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//               Intent intent = new Intent(getApplicationContext(), bdi_java.class);
//               startActivity(intent);
//            }
//        });
//
//    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void bdiClicked(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ivlv.me/pz1fp "));
            startActivity(intent);
        }

        public void baiClicked(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ivlv.me/yJGuX "));
            startActivity(intent);
        }

        public void gadClicked(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yeunjeong.involve.me/gad7"));
            startActivity(intent);
        }

        public void seiClicked(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ivlv.me/usK48"));
            startActivity(intent);
        }

        public void hanyangClicked(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:031-400-4331"));
            startActivity(intent);
        }


}