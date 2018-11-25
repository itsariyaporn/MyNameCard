package com.example.windows81.mynamecard;


import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.windows81.mynamecard.databinding.ActivityMainBindingImpl;


public class Main2Activity extends AppCompatActivity {
    private NewNamecard viewModel;
    //Todo
    ActivityMainBindingImpl binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bindView();
    }

    // To bind views to this activity
    private void bindView(){
        viewModel = new NewNamecard ();
        binding = DataBindingUtil.setContentView (  this,R.layout.activity_main);
        binding.setViewmodel (viewModel);

        viewModel.setName("Woarakamon Nokkaew ");
        viewModel.setId("560611024");
        viewModel.setEmail("worakamonnk@gmail.com");
        viewModel.setTel("083-7253742");
        viewModel.setAddress("96/17 M.10 T.suthep Mung ChiangMai 50200");


    }

    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        if(v.getId() == R.id.btn_backy) {
            backy();
        }

        binding.textfirstname.setText(viewModel.getName());
        binding.textfirstname.setText(viewModel.getEmail());
        binding.textfirstname.setText(viewModel.getAddress());
        binding.textfirstname.setText(viewModel.getTel());
        binding.textfirstname.setText(viewModel.getId());

        hideKeyboardInput(v);
    }

    private void backy() {
        Intent i = new Intent(Main2Activity.this , MainActivity.class);
        startActivity(i);

    }



    // To hide Android soft keyboard
    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
