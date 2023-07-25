package com.example.kounetexpresse0_2.mapper;

import com.example.kounetexpresse0_2.dto.CustomerRequest;
import com.example.kounetexpresse0_2.entity.Clients;

import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
@Component
public class CustomerMapper {

    private ModelMapper modelMapper=new ModelMapper();
    public Clients from(CustomerRequest customerRequest){
        //Customer customer=new Customer();
        //customer.setName(customerRequest.name());
        //customer.setEmail(customerRequest.email());
        return  modelMapper.map(customerRequest, Clients.class);

    }

    public CustomerServiceOuterClass.Customer fromCustomer(Clients customer){
        return modelMapper.map(customer, CustomerServiceOuterClass.Customer.Builder.class).build();
    }
    public Clients fromGrpcCustomerRequest(CustomerServiceOuterClass.CustomerRequest customerRequest){
        return modelMapper.map(customerRequest, Clients.class);
    }
}
