package com.example.cinema;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class WebActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        if (button.getId() == R.id.button3) {
            Intent intent = new Intent("actionMain");
            startActivity(intent);
        } else {
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
        }
    }
}
