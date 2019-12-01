package com.example.musicplayer.devices;

import tatanpoker.com.frameworklib.framework.TreeDeviceManager;
import tatanpoker.com.tree.annotations.DeviceManager;
import tatanpoker.com.tree.annotations.Local;

@DeviceManager
public abstract class Devices extends TreeDeviceManager {
    @Local
    public abstract Microphone getMicrophone();


    public abstract Speaker getSpeaker();

    public abstract CustomServer getServer();
}