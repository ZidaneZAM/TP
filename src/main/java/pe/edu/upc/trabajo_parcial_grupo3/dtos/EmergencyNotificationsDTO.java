package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class EmergencyNotificationsDTO {
    private int notificationID;
    private LocalDate date;;
    private String Description;;
    private String personnelNotified;;
    private int employeeEmployeeID;

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

    public int getEmployeeEmployeeID() {
        return employeeEmployeeID;
    }

    public void setEmployeeEmployeeID(int employeeEmployeeID) {
        this.employeeEmployeeID = employeeEmployeeID;
    }

}
