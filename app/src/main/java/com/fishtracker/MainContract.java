package com.fishtracker;

/**
 * Defines the contract between the View {@link MainActivity} and the Presenter
 * {@link MainPresenter}
 */

public interface MainContract {
    interface MvpView {
        void navigateToSignIn(String message);

        void navigateToSignUp(String message);
    }
    interface Presenter {
        void handleSignInButtonClick();

        void handleSignUpButtonClick();
    }
}
