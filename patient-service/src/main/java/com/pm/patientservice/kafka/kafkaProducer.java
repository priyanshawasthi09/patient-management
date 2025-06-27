package com.pm.patientservice.kafka;

import com.pm.patientservice.model.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import patient.events.PatientEvent;

@Service
public class kafkaProducer {
    private static final Logger log = LoggerFactory.getLogger(kafkaProducer.class);
    private final KafkaTemplate<String, byte[]> kafkaTemplate;
    public kafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(Patient patient){
        PatientEvent event = PatientEvent.newBuilder()
                .setPatientId(patient.getId().toString())
                .setEmail(patient.getEmail())
                .setName(patient.getName())
                .setEventType("PATIENT_CREATED")
                .build();

        try {
            kafkaTemplate.send("patient", event.toByteArray());
        } catch (Exception e) {
            log.error("Error Sending Patient Created Event : {}", event);
        }
    }


}
