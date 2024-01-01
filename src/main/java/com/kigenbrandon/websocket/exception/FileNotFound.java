package com.kigenbrandon.websocket.exception;

import java.io.IOException;

public class FileNotFound extends IOException {

    public FileNotFound(String message) {
        super(message);
    }
}
