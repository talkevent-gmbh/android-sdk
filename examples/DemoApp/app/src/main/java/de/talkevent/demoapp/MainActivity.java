package de.talkevent.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import de.talkevent.android_sdk.Models.TalkeventSDK;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSDK(View src) {
        TalkeventSDK talkevent = new TalkeventSDK();
        talkevent.setClientNumber("vcapp");
        talkevent.open();

    }
}
