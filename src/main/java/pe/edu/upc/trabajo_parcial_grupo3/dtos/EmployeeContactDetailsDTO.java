package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

public class EmployeeContactDetailsDTO {

    private int emplyeeContactId;
    private String phoneNumber;
    private String email;
    private String address;

    public int getEmplyeeContactId() {
        return emplyeeContactId;
    }

    public void setEmplyeeContactId(int emplyeeContactId) {
        this.emplyeeContactId = emplyeeContactId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
