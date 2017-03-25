package com.example.messi.kelimeturetmece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(button2.getText()==null) {
                button2.setText((CharSequence) button9.getText());
            }
                else if (button3.getText()==" "){
                button3.setText((CharSequence) button9.getText());
            }
            else if (button4.getText()==null){
                button4.setText((CharSequence) button9.getText());
            }
            else if (button5.getText()==null){
                button5.setText((CharSequence) button9.getText());
            }
            else if (button6.getText()==null){
                button6.setText((CharSequence) button9.getText());
            }
            else if (button7.getText()==" "){
                button7.setText((CharSequence) button9.getText());
            }
            else if (button8.getText()==" "){
                button8.setText((CharSequence) button9.getText());
            }
            }
        });

    }

}
