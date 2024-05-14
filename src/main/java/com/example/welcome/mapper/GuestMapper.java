package com.example.welcome.mapper;

import com.example.welcome.entity.Guest;
import com.example.welcome.entity.IPStorage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GuestMapper {

    int insert(Guest guest);

    void insertIPStorage(IPStorage ipStorage);
}
