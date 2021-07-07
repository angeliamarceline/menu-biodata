package src.task;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Angelia");
        person.setLastName("Marceline");
        person.setAddress("Jakarta");
        person.setDateOfBirth("1999");

        Education education = new Education();
        education.setElementarySchool("SD Regina Pacis");
        education.setJuniorHighSchool("SMP Regina Pacis");
        education.setSeniorHighSchool("SMA Regina Pacis");
        education.setUniversity("Universitas Bina Nusantara");

        System.out.println("Menu");
        System.out.println("1. Personal Information");
        System.out.println("2. Education Background");

        // membuat variabel dan Scanner
        String menu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Input [1 | 2] : ");
        menu = scan.nextLine();

        switch (menu) {
            case "1":
                System.out.println("Personal Information");
                System.out.println("Full Name :" + " " + person.getFirstName() + " " + person.getLastName());
                System.out.println("Address :" + " " + person.getAddress());
                System.out.println("Age :" + " " + person.getDateOfBirth() + " " + "Years");
                break;
            case "2":
                System.out.println("Education Background");
                System.out.println("Elementary School :" + " " + education.getElementarySchool());
                System.out.println("Junior High School :" + " " + education.getJuniorHighSchool());
                System.out.println("Senior High School :" + " " + education.getSeniorHighSchool());
                System.out.println("Universitas :" + " " + education.getUniversity());
                break;
            default:
                System.out.println("Error!");
        }

        scan.close();
    }
}
