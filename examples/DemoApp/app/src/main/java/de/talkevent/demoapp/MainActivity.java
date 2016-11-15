package de.talkevent.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import de.talkevent.android_sdk.Models.TalkeventSDK;


public class MainActivity extends AppCompatActivity {

    TalkeventSDK talkevent;
    String clientNumber = "";
    String apiUrl = "";
    String kurentoRoomUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        talkevent = new TalkeventSDK(this);
    }

    public void launchSDK(View src) {

        talkevent.setClientNumber(clientNumber);
        talkevent.setApiUrl(apiUrl);
        talkevent.setKurentoRoomUrl(kurentoRoomUrl);
        talkevent.open();

    }
}
