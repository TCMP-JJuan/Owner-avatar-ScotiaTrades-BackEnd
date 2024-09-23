package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/api/trades")
public class TradeLogController {

    @GetMapping("/log")
    public SseEmitter streamLog() {
        SseEmitter emitter = new SseEmitter();

        // Simulate some database events for testing
        new Thread(() -> {
            try {
                // Simulate sending a log message every 5 seconds
                for (int i = 0; i < 5; i++) {
                    emitter.send("New trade entry at " + System.currentTimeMillis());
                    Thread.sleep(5000);
                }
                emitter.complete();
            } catch (Exception e) {
                emitter.completeWithError(e);
            }
        }).start();

        return emitter;
    }
}