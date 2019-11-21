package com.fishtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Displays the Main screen.
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mainPresenter;
    private TextView tvEventInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        tvEventInfo = findViewById(R.id.tvEventInfo);
    }

    public void signin(View view){
        mainPresenter.handleSignInButtonClick();
    }

    public void signup(View view){
        mainPresenter.handleSignUpButtonClick();
    }

    @Override
    public void navigateToSignIn(String message) {
        tvEventInfo.setText(message);
    }

    @Override
    public void navigateToSignUp(String message) {
        tvEventInfo.setText(message);
    }

}