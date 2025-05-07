// Guest.java
package com.hms.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String preferences;
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}