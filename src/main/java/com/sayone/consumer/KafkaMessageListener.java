package com.sayone.consumer;

import com.sayone.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka_demo",groupId = "dm-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

}
