package com.example.graphics_primitives;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.graphics_primitives.MyClass view = new com.example.graphics_primitives.MyClass(this);
        setContentView(view);
    }
}