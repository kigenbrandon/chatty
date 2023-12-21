package com.kigenbrandon.websocket.screenshots.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
@RequestMapping("api/v1/screen-shot")
public class ScreenShotController {
    @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getScreenShot() {
        InputStream file = null;
        byte[] f = new byte[0];
        try {
            file = new FileInputStream(new File("/home/brandon/repos/chatty/spring-boot-websocket-chat-app/src/main/java/com/kigenbrandon/websocket/screenshots/images/Screenshot_2023-12-21_14_51_21.png"));
            f = file.readAllBytes();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(f, HttpStatus.OK);
    }

}
