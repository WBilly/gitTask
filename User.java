package com.company;

import java.util.Date;

public class User {
    private String firstName; //Имя посетителя;
    private String lastName;
    private int age;
    private String email;
    private String status;
    private String timeStamp;

    public User(String firstName, String lastName, int age, String email, String status, String timeStamp) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.email = email;
         this.status = status;
         this.timeStamp = timeStamp;
    }

// getter & setter for firstName;
   public String getFirstName () {
        return firstName;
    }
   public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

// getter & setter for lastName;
   public String getLastName () {
        return lastName;
    }
   public void setLastName (String lastName) {
        this.lastName = lastName;
    }

// getter & setter for age;
   public int getAge () {
        return age;
    }
   public void setAge (int age) {
        this.age = age;
    }

// getter & setter for email;
   public String getEmail () {
        return email;
    }
   public void setEmail (String email) {
        this.email = email;
    }

// getter & setter for status;
   public  String getStatus () {
        return status;
    }
   public void setStatus (String status) {
        this.status = status;
    }

// getter & setter for timeStamp;
    public String getTimeStamp () {
        return timeStamp;
    }
    public void setTimeStamp (String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
