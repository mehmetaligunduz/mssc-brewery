package com.scalefocus.msscbrewery.services;

import com.scalefocus.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {

        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name("mehmet")
                .build();

    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name("Mehmet")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

        log.debug("Updating customer: {}", customerId);
        
    }

    @Override
    public void deleteCustomer(UUID customerId) {

        log.debug("Deleting customer: {}", customerId);

    }

}
