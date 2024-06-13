package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

public class MineDTO {

    private int minaId;

    private String name;
    private String location;
    private int employeeId;

    public int getMinaId() {
        return minaId;
    }

    public void setMinaId(int minaId) {
        this.minaId = minaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
