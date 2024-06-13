package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class InputOutputResourcesDTO {
    private int movementId;
    private LocalDate date;
    private String resourceType;
    private float quantity;
    private int minaId;

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

    public int getMinaId() {
        return minaId;
    }

    public void setMinaId(int minaId) {
        this.minaId = minaId;
    }
}
