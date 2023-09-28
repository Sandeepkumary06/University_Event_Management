package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.respository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;
    public String addEvent(Event eventModel) {
        if(eventModel != null){
            eventRepo.save(eventModel);
            return "Event added successfully";
        }
        return "Event not added in our database";
    }
    public Iterable<Event> getAllEvents() {
        return eventRepo.findAll();
    }
    public String updateEventById(Integer eventId , String eventLocation) {
        Optional<Event> event = eventRepo.findById(eventId);
        Event ourEvent = null;

        if(event.isPresent()){
            ourEvent = event.get();

        }else{
            return "Id is not found";
        }
        ourEvent.setLocationOfEvent(eventLocation);
        eventRepo.save(ourEvent);
        return "Event with this eventId "+eventId+" is updated Successfully";
    }

    public String deleteEventById(Integer eventId) {
        if(eventRepo.existsById(eventId)){
            eventRepo.deleteById(eventId);
            return "Event of this EventId "+eventId+" is remove from our database";
        }
        return "Event of this eventId "+eventId+" is not found in our database";
    }
}
