// Ticket.java
package com.kt.ts.app.ticketingservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "tickets")
public class Ticket {
//    @Id
    private String id;
    private String title;
    private String description;
    private String status; // e.g., Open, In Progress, Closed
    private String createdBy;

    // Getters and Setters
}
