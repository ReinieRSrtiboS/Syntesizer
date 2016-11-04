package com.syntesizer.reinier2.syntesizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    int instrument;

    //start het begin scherm
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //reageert op de geselecteerde radio button
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.guitar:
                if (checked) {
                    instrument = 1;
                    System.out.println("guitar");
                    break;
                }
            case R.id.piano:
                if (checked) {
                    instrument = 0;
                    System.out.println("piano");
                    break;
                }
        }
    }

    //als de knop 'play' wordt ingedrukt, ga naar volgende onderdeel
    public void Play(View view) {
        Intent intent = new Intent(this, pianoActivity.class);
        intent.putExtra("instrument", instrument);
        startActivity(intent);
    }
}