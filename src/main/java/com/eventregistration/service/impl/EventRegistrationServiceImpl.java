package com.eventregistration.service.impl;

import com.eventregistration.models.EventRegistrationDetails;
import com.eventregistration.repository.EventRegistrationRepo;
import com.eventregistration.repository.UserDetailRepo;
import com.eventregistration.service.EventRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {
   @Autowired
   EventRegistrationRepo eventRegistrationRepo;
   @Autowired
   UserDetailRepo userDetailRepo;
    @Override
    public EventRegistrationDetails register(EventRegistrationDetails registration) {
     registration.setRegisteredAt(LocalDateTime.now().toString());
     Long userId= Long.valueOf(registration.getUserId());
     if(userDetailRepo.existsById(userId)){
         return eventRegistrationRepo.save(registration);
     }else {
         return  new EventRegistrationDetails();
     }

    }

    @Override
    public List<EventRegistrationDetails> getRegistrationByUserId(Long userId) {
        return eventRegistrationRepo.findByUserId(userId.toString());// String.valueOf(userId)
    }

    @Override
    public EventRegistrationDetails getRegistrationById(Long registrationId) {
        return eventRegistrationRepo.findById(registrationId).get();
    }

    @Override
    public List<EventRegistrationDetails> getRegistrationByEventId(Long eventId) {
        return eventRegistrationRepo.findRegistrationDetailByEventId(String.valueOf(eventId));
    }

    @Override
    public List<EventRegistrationDetails> fetchAllRegistrations() {
        return eventRegistrationRepo.findAll();
    }

    @Override
    public void cancelRegistration(Long registrationId) {
      eventRegistrationRepo.deleteById(registrationId);
    }
}
