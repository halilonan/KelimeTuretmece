package com.example.messi.kelimeturetmece;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Main2Activity extends AppCompatActivity {
    ImageLoader imageLoader;
    RequestQueue requestQueue;
    JSONObject[] filteredmitolojiList;
    JSONObject[] imageList;
    String[] ary  ;
    String currentAnswer = "";
    String karakter;

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

    Button random = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestQueue = Volley.newRequestQueue(Main2Activity.this);
        imageLoader = new ImageLoader(requestQueue, new ImageLoader.ImageCache() {
            @Override
            public Bitmap getBitmap(String url) {
                return null;
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {

            }
        });

        random = (Button) findViewById(R.id.random);
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
        random.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(MainActivity.sayac > 0) {
                    --MainActivity.sayac;
                    TextView text2 = (TextView)findViewById(R.id.textView2);
                    text2.setText("PUAN: "+String.valueOf(MainActivity.sayac));
                }else{
                    Toast.makeText(Main2Activity.this,"Yetersiz Puan",Toast.LENGTH_SHORT).show();
                }
                Random rand = new Random();
                int  c = rand.nextInt(2) + 1;
                if(c == 1){
                    button1.setText(currentAnswer);
                }else if (c == 2){
                    button2.setText(currentAnswer);
                }else if (c == 3){
                    button2.setText(currentAnswer);
                }else if (c == 4){
                    button2.setText(currentAnswer);
                }else if (c == 5){
                    button2.setText(currentAnswer);
                }else if (c == 6){
                    button2.setText(currentAnswer);
                }else if (c == 7){
                    button2.setText(currentAnswer);
                }else if (c == 8){
                    button2.setText(currentAnswer);
                }
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

        getData();

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
        currentAnswer = "";
        currentAnswer += button1.getText();
        currentAnswer += button2.getText();
        currentAnswer += button3.getText();
        currentAnswer += button4.getText();
        currentAnswer += button5.getText();
        currentAnswer += button6.getText();
        currentAnswer += button7.getText();
        currentAnswer += button8.getText();




        if(karakter.toUpperCase().equals(currentAnswer.toUpperCase())){
            for(int i = 0; i<karakter.length(); i++){
                MainActivity.sayac++;
            }

            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);

        }
        checkForAnswer();
    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            setAnswerLetterForButton((Button)view);
        }
    };
    public void checkForAnswer(){

    }
    public void prepareAnswerField(int length){


        for (int i = 8; i>=length; i--){

            Button btnHint = null;

            if (i == 0) {
                btnHint = (Button) findViewById(R.id.button1);

            } else if (i == 1) {
                btnHint = (Button) findViewById(R.id.button2);

            } else if (i == 2) {
                btnHint = (Button) findViewById(R.id.button3);

            } else if (i == 3) {
                btnHint = (Button) findViewById(R.id.button4);

            } else if (i == 4) {
                btnHint = (Button) findViewById(R.id.button5);

            } else if (i == 5) {
                btnHint = (Button) findViewById(R.id.button6);

            } else if (i == 6) {
                btnHint = (Button) findViewById(R.id.button7);

            } else if (i == 7) {
                btnHint = (Button) findViewById(R.id.button8);

            }

            try {
                btnHint.setVisibility(View.INVISIBLE);

            } catch (Exception e) {



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

    public void getData()
    {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://denemeler.im/medipol/android2/halil/halil.php";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        processData(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(stringRequest);
    }
    public void processData(String response)
    {
        try {
            JSONArray mitolojiArray = new JSONArray(response);

            JSONObject[] imageList = new JSONObject[mitolojiArray.length()];

            for(int i = 0; i < mitolojiArray.length(); i++)
            {
                imageList[i] = mitolojiArray.getJSONObject(i);
            }
            filteredmitolojiList = imageList;
            showData(imageList);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public void showData(JSONObject[] mitolojiList)
    {
        try {
            Random rand = new Random();
            int  n = rand.nextInt(26) + 0;

            String fotoName =  mitolojiList[n].getString("FOTOGRAF");
            String ipucu =  mitolojiList[n].getString("İPUCU");
            karakter = mitolojiList[n].getString("KARAKTER");


            String word = karakter;
            String randomizedWord = randomizeWord(word);
            String[] letters = shuffleWord(randomizedWord);
            showHint(letters);
            prepareAnswerField(word.length());

            NetworkImageView imageView = (NetworkImageView)findViewById(R.id.image);
            TextView text = (TextView)findViewById(R.id.textView);
            text.setText(ipucu);
            TextView text2 = (TextView)findViewById(R.id.textView2);
            text2.setText("PUAN: "+String.valueOf(MainActivity.sayac));
            imageView.setImageUrl("http://denemeler.im/medipol/android2/halil/"+fotoName,imageLoader);


            Toast.makeText(Main2Activity.this,karakter,Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
}

