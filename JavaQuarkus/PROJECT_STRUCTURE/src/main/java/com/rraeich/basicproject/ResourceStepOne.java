package com.rraeich.basicproject;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Map;

@Path("/hello")
public class ResourceStepOne {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(StudentRequest request) {
        String info = "Name: " + request.name + "\nAge: " + request.age;
        info += "\nAddress: " + (request.address.addressGeneral + " - " + request.address.zipCode);
        info += "\nSchool: " + (request.school.name);
        info += "\nSchool Address: " + (request.school.address.addressGeneral + " - " + request.school.address.zipCode);
        info += "\nMath Note: " + (request.classNotes.get("math"));
        info += "\nHistory Note: " + (request.classNotes.get("his"));
        info += "\nScience Note: " + (request.classNotes.get("sci"));
        return info;
    }

    public static class StudentRequest {
        public String name;
        public int age;
        public School school;
        public Address address;
        public Map<String, Integer> classNotes;
    }

    public static class School {
        public String name;
        public Address address;
    }

    public static class Address {
        public String addressGeneral;
        public String zipCode;
    }
}


