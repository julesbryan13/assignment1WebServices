package com.example.restservice.service;

import com.example.restservice.modelAssignment1.Customer;
import com.example.restservice.modelAssignment1.Address;
import com.example.restservice.modelAssignment1.Phone;

import java.util.ArrayList;
import java.util.List;

public class CustomersService {

    static List<Customer> customers = new ArrayList<>();

    public List<Customer> getAllCustomers(){

        Customer customer1 = new Customer(1,"Bryan","Valdez",
                new Address(321,"Red","Montreal","QC"),
                new Phone(1,222,1234567));
        Customer customer2 = new Customer(2,"Gon","Freecs",
                new Address(654,"Blue","Toronto","ON"),
                new Phone(1,416,5550125));
        Customer customer3 = new Customer(3,"Killua","Zoldyck",
                new Address(987,"Green","Ottawa","ON"),
                new Phone(1,343,5950185));

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        return customers;
    }

    public Customer getByID(int id){
        for(Customer c : customers){
            if (c.getCustomerID() == id){
                return c;
            }
        }
        return null;
    }

    public void addCostumer(Customer c){
        customers.add(c);
    }
}