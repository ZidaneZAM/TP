package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EmerNotification")
public class EmergencyNotifications {
    @Id
    @Column(nullable = false)
    private int notificationID;
    @Column(nullable = false)
    private LocalDate date;;
    @Column(nullable = false)
    private String Description;;
    @Column(nullable = false)
    private String personnelNotified;;
    @ManyToOne
    @JoinColumn(name ="employee_id",nullable = false)
    private Employee employee;

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPersonnelNotified() {
        return personnelNotified;
    }

    public void setPersonnelNotified(String personnelNotified) {
        this.personnelNotified = personnelNotified;
    }



    public EmergencyNotifications() {
    }

    public EmergencyNotifications(int notificationID, LocalDate date, String description, String personnelNotified) {
        this.notificationID = notificationID;
        this.date = date;
        Description = description;
        this.personnelNotified = personnelNotified;

    }
}
