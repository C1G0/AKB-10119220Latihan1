package com.example.a10119220latihan1;

//Tanggal Pengerjaan: 18-04-2022
//Nim: 10119220
//Nama: Moch. Wandika Yusgiar
//Kelas: IF - 6

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.SpannableString;

import android.text.Spanned;

import android.text.style.StyleSpan;

import android.widget.TextView;

import android.graphics.Typeface;

import android.text.Html;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        //textView1.setText(getString(R.string.textView1));

        textView1.setText(Html.fromHtml("<b>DigiTeam</b><br>" +
                "Digital Together Everyone Achieve More" +
                "Jabar Digital Service"));

        textView2.setText(Html.fromHtml("<b>Dias Eka Fredianto, S.Kom, B.IT</b><br>" +
                "UI Designer"));

    }
}