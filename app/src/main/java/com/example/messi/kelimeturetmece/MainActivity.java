package com.example.messi.kelimeturetmece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this,randomizeWord("Kelebek"),Toast.LENGTH_LONG).show();

        String word = "kelebek";

        String randomizedWord = randomizeWord(word);

        String[] letters = shuffleWord(randomizedWord);
        showHint(letters);


        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);


        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button1.setText("");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button2.setText("");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button3.setText("");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button4.setText("");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button5.setText("");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button6.setText("");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button7.setText("");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                button8.setText("");
            }
        });



        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
            if(button1.getText().equals("")) {
                button1.setText((CharSequence) button9.getText());
            }
            else if (button2.getText().equals("")){
                button2.setText((CharSequence) button9.getText());
            }
            else if (button3.getText().equals("")){
                button3.setText((CharSequence) button9.getText());
            }
            else if (button4.getText().equals("")){
                button4.setText((CharSequence) button9.getText());
            }
            else if (button5.getText().equals("")){
                button5.setText((CharSequence) button9.getText());
            }
            else if (button6.getText().equals("")){
                button6.setText((CharSequence) button9.getText());
            }
            else if (button7.getText().equals("")){
                button7.setText((CharSequence) button9.getText());
            }
            else if (button8.getText().equals("")){
                button8.setText((CharSequence) button9.getText());
            }
            }
        });

    }


    private static final String ALLOWED_CHARACTERS ="qwertyuiopasdfghjklzxcvbnm";

    private static String getRandomString(final int sizeOfRandomString)
    {
        final Random random=new Random();
        final StringBuilder sb=new StringBuilder(sizeOfRandomString);
        for(int i=0;i<sizeOfRandomString;++i)
            sb.append(ALLOWED_CHARACTERS.charAt(random.nextInt(ALLOWED_CHARACTERS.length())));
        return sb.toString();
    }

    public String randomizeWord(String word){

        int wordLength = word.length();

        String tempString = word + getRandomString(16 - wordLength);

        return tempString;
    }

    static String[] shuffleWord(String word)
    {
        String[] ar = word.split("");
        ar = Arrays.copyOfRange(ar, 1, ar.length);
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }

    public void showHint(String[] ar){

        for (int i = 0; i<=ar.length; i++){
            Button btnHint = null;

            if (i == 0) {
                btnHint = (Button) findViewById(R.id.button9);
            } else if (i == 1)
            {
                btnHint = (Button) findViewById(R.id.button10);
            }else if (i == 2)
            {
                btnHint = (Button) findViewById(R.id.button11);
            }else if (i == 3)
            {
                btnHint = (Button) findViewById(R.id.button12);
            }else if (i == 4)
            {
                btnHint = (Button) findViewById(R.id.button13);
            }else if (i == 5)
            {
                btnHint = (Button) findViewById(R.id.button14);
            }else if (i == 6)
            {
                btnHint = (Button) findViewById(R.id.button15);
            }else if (i == 7)
            {
                btnHint = (Button) findViewById(R.id.button16);
            }else if (i == 8)
            {
                btnHint = (Button) findViewById(R.id.button17);
            }else if (i == 9)
            {
                btnHint = (Button) findViewById(R.id.button18);
            }else if (i == 10)
            {
                btnHint = (Button) findViewById(R.id.button19);
            }else if (i == 11)
            {
                btnHint = (Button) findViewById(R.id.button20);
            }else if (i == 12)
            {
                btnHint = (Button) findViewById(R.id.button21);
            }else if (i == 13)
            {
                btnHint = (Button) findViewById(R.id.button22);
            }else if (i == 14)
            {
                btnHint = (Button) findViewById(R.id.button23);
            }else if (i == 15)
            {
                btnHint = (Button) findViewById(R.id.button24);
            }


            try {
                btnHint.setText(ar[i]);

            }catch (Exception e)
            {


            }

        }
    }
}
