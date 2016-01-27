package com.nanodegree.android.myappportfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Prince Bansal Local on 28-01-2016.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button firstButton,secondButton,thirdButton,fourthButton,fifthButton,sixthButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setInit();
    }

    private void init() {
        firstButton=(Button)findViewById(R.id.first_button);
        secondButton=(Button)findViewById(R.id.second_button);
        thirdButton=(Button)findViewById(R.id.third_button);
        fourthButton=(Button)findViewById(R.id.fourth_button);
        fifthButton=(Button)findViewById(R.id.fifth_button);
        sixthButton=(Button)findViewById(R.id.sixth_button);
    }

    private void setInit() {
        firstButton.setOnClickListener(this);
        secondButton.setOnClickListener(this);
        thirdButton.setOnClickListener(this);
        fourthButton.setOnClickListener(this);
        fifthButton.setOnClickListener(this);
        sixthButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.first_button:
                showMessage("First button pressed");
                break;
            case R.id.second_button:
                showMessage("Second button pressed");
                break;
            case R.id.third_button:
                showMessage("Third button pressed");
                break;
            case R.id.fourth_button:
                showMessage("Fourth button pressed");
                break;
            case R.id.fifth_button:
                showMessage("Fifth button pressed");
                break;
            case R.id.sixth_button:
                showMessage("Sixth button pressed");
                break;
        }
    }

    private void showMessage(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
