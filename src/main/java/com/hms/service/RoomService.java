// RoomService.java
package com.hms.service;

import com.hms.entity.Room;
import com.hms.repository.RoomRepository;
import org.springframework.stereotype.Service; 

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // Add methods for room management
}