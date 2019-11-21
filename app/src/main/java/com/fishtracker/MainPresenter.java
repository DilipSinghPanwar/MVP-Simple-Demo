package com.fishtracker;

import android.util.Log;
import android.widget.Toast;

/**
 * Handles actions from the View and updates the UI as needed.
 */
public class MainPresenter implements MainContract.Presenter {

    private static final String TAG = MainPresenter.class.getSimpleName();
    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void handleSignInButtonClick() {
        mvpView.navigateToSignIn("SignInButtonClick");
    }

    @Override
    public void handleSignUpButtonClick() {
        mvpView.navigateToSignUp("SignUpButtonClick");
    }

}