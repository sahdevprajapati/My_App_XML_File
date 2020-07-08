package com.example.xmldesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Activity view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView (R.layout.activity_main);

        ArrayList<ExItem> exlist=new ArrayList<> ();
        exlist.add (new ExItem (R.drawable.pens,"Luna","Ok","Today"));
        exlist.add (new ExItem (R.drawable.doremon,"Donald","you forgot the...","Today"));
        exlist.add (new ExItem (R.drawable.jerry,"Alexander","Good","Yesterday"));
        exlist.add (new ExItem (R.drawable.mickey,"Watson","how are you? ","30/05/2020"));
        exlist.add (new ExItem (R.drawable.pikachu1,"Ava","hello","29/05/2020"));
        exlist.add (new ExItem (R.drawable.pens,"Luna","Ok","Today"));
        exlist.add (new ExItem (R.drawable.doremon,"Donald","you forgot the...","Today"));
        exlist.add (new ExItem (R.drawable.jerry,"Alexander","Good","Yesterday"));

        mRecyclerview=findViewById (R.id.recyclview);
        mRecyclerview.setHasFixedSize (true);
        mLayoutManager=new LinearLayoutManager (this);
        mAdapter= new ExAdapter (exlist);

        mRecyclerview.setLayoutManager (mLayoutManager);
        mRecyclerview.setAdapter (mAdapter);
    }
}
