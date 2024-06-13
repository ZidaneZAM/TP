package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Mine")
public class Mine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int minaId;
    @Column(length = 30, unique = true)
    private String name;
    @Column(length = 30, unique = true)
    private String location;
    @Column(nullable = false)
    private int employeeId;


    @OneToMany
    @JoinColumn(name ="register_equipment",nullable = false)
    private List<EquimentRegistry> registry;

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

    public Mine() {
    }

    public Mine(int minaId, String name, String location, int employeeId) {
        this.minaId = minaId;
        this.name = name;
        this.location = location;
        this.employeeId = employeeId;
    }
}
