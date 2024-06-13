package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "InputOutputResources")
public class InputOutputResources {
    @Id
    @Column(nullable = false)
    private int movementId;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String resourceType;
    @Column(nullable = false)
    private float quantity;

    @ManyToOne
    @JoinColumn(name ="mina_id",nullable = false)
    private Mine mina;

    public int getMovementId() {
        return movementId;
    }

    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    public InputOutputResources() {
    }

    public InputOutputResources(int movementId, LocalDate date, String resourceType, float quantity) {
        this.movementId = movementId;
        this.date = date;
        this.resourceType = resourceType;
        this.quantity = quantity;

    }
}
