package com.example.restservice.api;

import com.example.restservice.modelAssignment1.Customer;
import com.example.restservice.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomersController {

    CustomersService customersService = new CustomersService();

    // To GET
    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return customersService.getAllCustomers();
    }

    // For PathVariable
    @GetMapping("/customer/{customerID}")
    public Customer getCustomerByID(@PathVariable int customerID){
        return customersService.getByID(customerID);
    }

    //
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        customersService.addCostumer(customer);
        return customer;
    }

}