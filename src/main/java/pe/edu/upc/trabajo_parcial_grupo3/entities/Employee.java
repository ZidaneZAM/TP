package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name="Employee", uniqueConstraints =  {@UniqueConstraint(columnNames = {"userd_id", "firstName","LastName","Position"})})
public class Employee implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(nullable = false)
    private Long employeeId;;
    @Column(nullable = false)
    private String firstName;;
    @Column(nullable = false)
    private String lastName;;
    @Column(nullable = false)
    private String Position;;
    @Column(nullable = false)
    private LocalDate entryDate;
    @Column(nullable = false)
    private String visitReason;
    @Column(nullable = false)
    private String contactDetails;;
    @Column(nullable = false)

    //realice conection
    @ManyToOne
    @JoinColumn(name ="user_id",nullable = false)
    private Usuario user;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

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

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }


    public Employee() {
    }

    public Employee(Long employeeId, String firstName, String lastName, String position, String contactDetails) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        Position = position;
        this.contactDetails = contactDetails;

    }
}
