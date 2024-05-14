package com.example.welcome.service;

import com.example.welcome.entity.Guest;
import com.example.welcome.entity.IPStorage;
import com.example.welcome.mapper.GuestMapper;
import com.example.welcome.utils.IPZone;
import com.example.welcome.utils.QQWry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GuestService {
    @Autowired
    private GuestMapper guestMapper;

    public void register(Guest guest) {
        guestMapper.insert(guest);
    }

    public void IPStorage(IPStorage ipStorage) throws IOException {
        String ip = ipStorage.getIp();
        QQWry qqWry = new QQWry();
        try {
            IPZone zone=qqWry.findIP(ip);
            String subInfo = zone.getSubInfo();
            System.out.println("subInfo = " + subInfo);
            ipStorage.setAddress(zone.getMainInfo());
        }catch (Exception e){
            e.printStackTrace();
        }


        guestMapper.insertIPStorage(ipStorage);
    }
}
