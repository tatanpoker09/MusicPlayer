package com.example.musicplayer.devices;

import com.example.musicplayer.R;

import java.io.File;

import tatanpoker.com.frameworklib.exceptions.InvalidIDException;
import tatanpoker.com.frameworklib.framework.Framework;
import tatanpoker.com.frameworklib.framework.NetworkComponent;
import tatanpoker.com.frameworklib.framework.network.server.Server;
import tatanpoker.com.tree.annotations.Device;

import static com.example.musicplayer.devices.Microphone.MICROPHONE_ID;

@Device(id = MICROPHONE_ID, layout = R.layout.microphone_layout)
public class Microphone extends NetworkComponent {
    static final int MICROPHONE_ID = 1;
    private Speaker speaker;

    public Microphone(int id, int layout) throws InvalidIDException {
        super(id, layout);
    }

    public void onRecognition(String intent){
        if(intent.startsWith("play")){
            String songName = intent.replace("play ", "") + ".mp3";
            Devices deviceManager = (Devices) Framework.getDeviceManager();
            Server server = deviceManager.getServer();
            Speaker speaker = deviceManager.getSpeaker();
            File songFile = server.transferFile(songName, speaker);
            speaker.play(songFile);
        }
    }


    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Speaker getSpeaker() {
        return speaker;
    }
}
