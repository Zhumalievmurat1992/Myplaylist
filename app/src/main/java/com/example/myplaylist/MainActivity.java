package com.example.myplaylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myplaylist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment1()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2, new Fragment2()).commit();
    }
}