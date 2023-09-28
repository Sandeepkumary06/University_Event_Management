package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "EC")
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping("/event")
    public String addEvent(@RequestBody Event eventModel){
        return eventService.addEvent(eventModel);
    }
    @GetMapping("/events")
    public Iterable<Event>getAllEvents(){
        return eventService.getAllEvents();
    }
    @PutMapping("/event/{eventId}/{EventLocation}")
    public String updateEventById(@PathVariable Integer eventId, @PathVariable String EventLocation){
        return eventService.updateEventById(eventId,EventLocation);
    }
    @DeleteMapping("/event/{eventId}")
    public String deleteEventById(@PathVariable Integer eventId){
        return eventService.deleteEventById(eventId);
    }
}
