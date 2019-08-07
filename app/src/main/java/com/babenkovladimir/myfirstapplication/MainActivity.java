package com.babenkovladimir.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
//    setContentView(R.layout.activity_main_frame_layout);
    setContentView(R.layout.activity_main_linear_layout);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

  }
}
