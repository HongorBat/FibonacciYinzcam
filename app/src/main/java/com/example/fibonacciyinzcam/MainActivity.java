package com.example.fibonacciyinzcam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fibonacciyinzcam.databinding.ActivityMainBinding;

import java.math.BigInteger;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //View Binding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        NumberAdapter numberAdapter = new NumberAdapter();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        binding.recyclerView.setLayoutManager(layoutManager);

        binding.recyclerView.setAdapter(numberAdapter);
    }


}