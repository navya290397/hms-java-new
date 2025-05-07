// RoomController.java
package com.hms.controller;

import com.hms.entity.Room;
import com.hms.service.RoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    // Add endpoints for room management
}