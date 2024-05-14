package com.example.welcome.controller;

import com.example.welcome.entity.Guest;
import com.example.welcome.entity.IPStorage;
import com.example.welcome.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class GuestController {
    @Autowired
    private GuestService guestService;
    @PostMapping("/register")
    public String register( Guest guest){
        guestService.register(guest);
        return "redirect:/success.html";
    }
    @GetMapping("/IPStorage")
    public void IPStorage(String IP, HttpServletRequest request, HttpServletResponse response) throws IOException {
      //  guestService.IPStorage(IP);
 /*       String remoteUser = request.getRemoteUser();
        System.out.println("remoteUser = " + remoteUser);*/
        String remoteHost = request.getRemoteHost();
        System.out.println("remoteHost = " + remoteHost);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        IPStorage ipStorage = new IPStorage();
        ipStorage.setIp(remoteHost);
        ipStorage.setTime(now.toString());
        guestService.IPStorage(ipStorage);

    }
}
