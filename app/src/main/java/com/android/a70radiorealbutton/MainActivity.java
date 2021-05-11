package com.android.a70radiorealbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import co.ceryle.radiorealbutton.library.RadioRealButton;
import co.ceryle.radiorealbutton.library.RadioRealButtonGroup;

public class MainActivity extends AppCompatActivity {

    RadioRealButton btnOne,btnTwo;
    RadioRealButtonGroup groupButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupButton = findViewById(R.id.group_button);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);

        groupButton.setOnClickedButtonListener(new RadioRealButtonGroup.OnClickedButtonListener() {
            @Override
            public void onClickedButton(RadioRealButton button, int position) {
                Toast.makeText(MainActivity.this, "Clicked"+button.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        groupButton.setOnPositionChangedListener(new RadioRealButtonGroup.OnPositionChangedListener() {
            @Override
            public void onPositionChanged(RadioRealButton button, int position) {
                Toast.makeText(MainActivity.this, "Position Changed"+button.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}