package com.example.simpletodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    List<String> items;

    Button button2;
    EditText edItem;
    RecyclerView rvItem;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2 = findViewById<>(R.id.button2);
        edItem = findViewById<>(R.id.edItem);
        rvItem = findViewById<>(R.id.rvItem);




        items = new ArrayList<>();
        items.add("Buy Milk");
        items.add("Go to the gym");
        items.add("Have fun!");


    }
}