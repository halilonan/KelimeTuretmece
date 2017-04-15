package com.example.messi.kelimeturetmece;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    ImageLoader imageLoader;
    RequestQueue requestQueue;

    Button button1 = null;
    Button button2 = null;
    Button button3 = null;
    Button button4 = null;
    Button button5 = null;
    Button button6 = null;
    Button button7 = null;
    Button button8 = null;
    Button button9 = null;
    Button button10= null;
    Button button11= null;
    Button button12= null;
    Button button13= null;
    Button button14= null;
    Button button15= null;
    Button button16= null;
    Button button17= null;
    Button button18= null;
    Button button19= null;
    Button button20= null;
    Button button21= null;
    Button button22= null;
    Button button23= null;
    Button button24= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this,randomizeWord("Kelebek"),Toast.LENGTH_LONG).show();

        requestQueue = Volley.newRequestQueue(MainActivity.this);
        imageLoader = new ImageLoader(requestQueue, new ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                return null;
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {

            }
        });




        String word = "KRATOS";
        String randomizedWord = randomizeWord(word);
        String[] letters = shuffleWord(randomizedWord);
        showHint(letters);
        prepareAnswerField(word.length());


     button1 = (Button) findViewById(R.id.button1);
     button2 = (Button) findViewById(R.id.button2);
     button3 = (Button) findViewById(R.id.button3);
     button4 = (Button) findViewById(R.id.button4);
     button5 = (Button) findViewById(R.id.button5);
     button6 = (Button) findViewById(R.id.button6);
     button7 = (Button) findViewById(R.id.button7);
     button8 = (Button) findViewById(R.id.button8);
     button9 = (Button) findViewById(R.id.button9);
     button10 = (Button) findViewById(R.id.button10);
     button11 = (Button) findViewById(R.id.button11);
     button12 = (Button) findViewById(R.id.button12);
     button13 = (Button) findViewById(R.id.button13);
     button14 = (Button) findViewById(R.id.button14);
     button15 = (Button) findViewById(R.id.button15);
     button16 = (Button) findViewById(R.id.button16);
     button17 = (Button) findViewById(R.id.button17);
     button18 = (Button) findViewById(R.id.button18);
     button19 = (Button) findViewById(R.id.button19);
     button20 = (Button) findViewById(R.id.button20);
     button21 = (Button) findViewById(R.id.button21);
     button22 = (Button) findViewById(R.id.button22);
     button23 = (Button) findViewById(R.id.button23);
     button24 = (Button) findViewById(R.id.button24);

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


        button9.setOnClickListener(onClickListener);
        button10.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);
        button13.setOnClickListener(onClickListener);
        button14.setOnClickListener(onClickListener);
        button15.setOnClickListener(onClickListener);
        button16.setOnClickListener(onClickListener);
        button17.setOnClickListener(onClickListener);
        button18.setOnClickListener(onClickListener);
        button19.setOnClickListener(onClickListener);
        button20.setOnClickListener(onClickListener);
        button21.setOnClickListener(onClickListener);
        button22.setOnClickListener(onClickListener);
        button23.setOnClickListener(onClickListener);
        button24.setOnClickListener(onClickListener);


        NetworkImageView imageView = (NetworkImageView)findViewById(R.id.image);
        imageView.setImageUrl("https://vignette2.wikia.nocookie.net/godofwar/images/1/19/Kratos_rendering_concept.jpg",imageLoader);

    }

    public void setAnswerLetterForButton(Button btn)
    {
        if(button1.getText().equals("")) {
            button1.setText((CharSequence) btn.getText());
        }
        else if (button2.getText().equals("")){
            button2.setText((CharSequence) btn.getText());
        }
        else if (button3.getText().equals("")){
            button3.setText((CharSequence) btn.getText());
        }
        else if (button4.getText().equals("")){
            button4.setText((CharSequence) btn.getText());
        }
        else if (button5.getText().equals("")){
            button5.setText((CharSequence) btn.getText());
        }
        else if (button6.getText().equals("")){
            button6.setText((CharSequence) btn.getText());
        }
        else if (button7.getText().equals("")){
            button7.setText((CharSequence) btn.getText());
        }
        else if (button8.getText().equals("")){
            button8.setText((CharSequence) btn.getText());
        }



    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            setAnswerLetterForButton((Button)view);

            checkForAnswer();

        }
    };
    public void checkForAnswer(){
       
    }
    public void prepareAnswerField(int length){

        for (int i = 8; i>=length; i--){
            Button btnHint = null;

            if (i == 0) {
                btnHint = (Button) findViewById(R.id.button1);
            } else if (i == 1)
            {
                btnHint = (Button) findViewById(R.id.button2);
            }else if (i == 2)
            {
                btnHint = (Button) findViewById(R.id.button3);
            }else if (i == 3)
            {
                btnHint = (Button) findViewById(R.id.button4);
            }else if (i == 4)
            {
                btnHint = (Button) findViewById(R.id.button5);
            }else if (i == 5)
            {
                btnHint = (Button) findViewById(R.id.button6);
            }else if (i == 6)
            {
                btnHint = (Button) findViewById(R.id.button7);
            }else if (i == 7)
            {
                btnHint = (Button) findViewById(R.id.button8);
            }

            try {
                btnHint.setVisibility(View.INVISIBLE);

            }catch (Exception e)
            {


            }

        }
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
