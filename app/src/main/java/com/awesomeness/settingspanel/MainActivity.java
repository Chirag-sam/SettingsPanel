package com.awesomeness.settingspanel;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nfcPanel, internetPanel, volumePanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the buttons
        nfcPanel = findViewById(R.id.nfc_panel_button);
        internetPanel = findViewById(R.id.internet_button);
        volumePanel = findViewById(R.id.volume_button);

        //onClickListeners for the buttons
        nfcPanel.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.Panel.ACTION_NFC));
            }
        });

        internetPanel.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY)); //or ACTION_WIFI depending on what you want.
            }
        });

        volumePanel.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.Panel.ACTION_VOLUME));
            }
        });


    }
}
