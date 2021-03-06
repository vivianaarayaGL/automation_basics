package com.pluralsight.gettraining;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {

    public int patientId; //pk
    public String name;
    public String lastName;
    public Date birthDate;
    public String phone;
    public String city;
    public String email;
    public List<Patient> patientList = new ArrayList<Patient>();

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public Patient(int patientId, String name, String lastName, Date birthDate, String phone, String city, String email) {
        this.patientId = patientId;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.email = email;
    }

    public Patient() {
    }

    public Patient selectPatient(int patientId) {
        int pos = patientList.indexOf(patientId);
        return patientList.get(pos);
    }

    public Patient updatePatient(Patient patient) {
        int pos = patientList.indexOf(patientId);
        Patient toDelete = patientList.get(pos);
        patientList.remove(toDelete);
        patientList.add(patient);
        return patient;

    }

    public void deletePatient(int patientId) {
        int pos = patientList.indexOf(patientId);
        Patient toDelete = patientList.get(pos);
        patientList.remove(toDelete);


    }

}

