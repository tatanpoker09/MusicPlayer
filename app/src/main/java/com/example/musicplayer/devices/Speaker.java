package com.example.musicplayer.devices;

import android.media.MediaPlayer;
import android.net.Uri;

import com.example.musicplayer.R;

import java.io.File;

import tatanpoker.com.frameworklib.exceptions.InvalidIDException;
import tatanpoker.com.frameworklib.framework.Framework;
import tatanpoker.com.frameworklib.framework.NetworkComponent;
import tatanpoker.com.tree.annotations.Device;

import static com.example.musicplayer.devices.Speaker.SPEAKER_ID;

@Device(id = SPEAKER_ID, layout = R.layout.microphone_layout)
public class Speaker extends NetworkComponent {
    static final int SPEAKER_ID = 2;

    public Speaker(int id, int layout) throws InvalidIDException {
        super(id, layout);
    }

    public void play(File songFile) {
        if(songFile.exists()){
            Framework.getLogger().info("Yay this works!");
            Uri uri = Uri.fromFile(songFile);
            MediaPlayer mPlayer = MediaPlayer.create(Framework.getNetwork().getContext(), uri);
            mPlayer.start();
        } else {
            Framework.getLogger().severe("Uh oh we have a big issue.");
        }
    }
}
