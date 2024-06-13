package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "EmployeeContactDetails")
public class EmployeeContactDetails {
    @Id
    @Column(nullable = false)
    private int emplyeeContactId;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name ="employee_id",nullable = false)
    private Employee employee;

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

    public EmployeeContactDetails() {
    }

    public EmployeeContactDetails(int emplyeeContactId, String phoneNumber, String email, String address) {
        this.emplyeeContactId = emplyeeContactId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}
