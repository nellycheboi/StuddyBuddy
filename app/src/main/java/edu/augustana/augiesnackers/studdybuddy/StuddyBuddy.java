package edu.augustana.augiesnackers.studdybuddy;

import android.os.Bundle;

import com.firebase.client.Firebase;

/**
 * Created by Nelly on 4/24/2016.
 */
//sets firebase context
public class StuddyBuddy extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }


}
