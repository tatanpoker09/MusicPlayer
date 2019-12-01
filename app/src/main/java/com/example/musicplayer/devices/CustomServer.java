package com.example.musicplayer.devices;

import com.example.musicplayer.R;

import tatanpoker.com.frameworklib.exceptions.InvalidIDException;
import tatanpoker.com.frameworklib.framework.network.server.SocketServer;
import tatanpoker.com.tree.annotations.Device;

@Device(id = 0, layout = R.layout.server_layout)
public class CustomServer extends SocketServer {
    public CustomServer() throws InvalidIDException {
    }
}
