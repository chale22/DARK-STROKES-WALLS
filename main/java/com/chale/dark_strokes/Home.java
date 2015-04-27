package com.chale.dark_strokes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;

public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Intent intent = new Intent(Home.this, com.jahirfiquitiva.paperboard.activities.Main.class);
            startActivity(intent);


    }

}
