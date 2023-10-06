package main;

import controller.DoctorManagement;
import model.Doctor;

public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        
        new DoctorManagement(doctor).run();
    }
    
}