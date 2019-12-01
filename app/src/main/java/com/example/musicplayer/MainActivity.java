package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.musicplayer.devices.Devices;

import tatanpoker.com.frameworklib.framework.Framework;
import tatanpoker.com.frameworklib.framework.Tree;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Devices deviceManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Framework.startNetwork(this);
        deviceManager = Framework.registerComponents(Devices.class);
        Framework.networkEnable();
        deviceManager.getMicrophone().setSpeaker(deviceManager.getSpeaker());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public Devices getDeviceManager() {
        return deviceManager;
    }

    public void setDeviceManager(Devices deviceManager) {
        this.deviceManager = deviceManager;
    }
}
