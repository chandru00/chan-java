package dev.chan.chancontentcalendar.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.chan.chancontentcalendar.config.ContentCalendarProperties;

@RestController
public class HomeController {
//    @Value("${cc.welcomeMessage: Default Welcome Message}")
//    private String welcomeMessage;
//
//    @Value("${cc.about}")
//    private String about;

    private  final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
//        return Map.of("welcomeMessage", welcomeMessage, "about", about);
    }

}
