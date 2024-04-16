package tn.enicarthage.Projet_web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEvent {
	private final EventRepository eventRepository;

    @Autowired
    public Event saveEvent(Event event ) {
    	return eventRepository.save(event);
    }
   
    public ServiceEvent(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createOrUpdateEvent(Event event) {
        return eventRepository.save(event);
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

}


