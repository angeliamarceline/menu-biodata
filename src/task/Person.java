package src.task;

import java.time.LocalDate;

// import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {

    }

    public Person(String firstName, String lastName, String address, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // Methods
    // public String getFullName() {
    // return this.firstName + " " + this.lastName;
    // }

    // public int getUsia() {
    // LocalDate date = LocalDate.now();
    // this.usia = date.getYear() - this.tahunLahir;
    // return this.usia();
    // }
}
