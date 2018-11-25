package com.example.windows81.mynamecard;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.windows81.mynamecard.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {
    private NewNamecard viewModel;
    //Todo
    ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initView(){

        viewModel = new NewNamecard ();
        binding = DataBindingUtil.setContentView (  this,R.layout.activity_main);
        binding.setViewmodel (viewModel);

        viewModel.setFirstName("Chayanan  Chaowanapoonpol  570611040");
        viewModel.setEmail("it_sariya_pon@hotmail.com");
        viewModel.setTel("0882695213");
        viewModel.setAddress("47/1 SOI4 Samamkeelatedsaban Road Chiang Mai 50300");
        viewModel.setBirthday("27 October 1995");
    }


    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        if(v.getId() == R.id.btn_nextk) {
            nextk();
        }

        binding.textfirstname.setText(viewModel.getFirstName());
        binding.textfirstname.setText(viewModel.getEmail());
        binding.textfirstname.setText(viewModel.getAddress());
        binding.textfirstname.setText(viewModel.getTel());
        binding.textfirstname.setText(viewModel.getBirthday());

        

        hideKeyboardInput(v);
    }

    private void nextk() {
        Intent i = new Intent(MainActivity.this , Main2Activity.class);
        startActivity(i);

    }



    // To hide Android soft keyboard
    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }

  
}
