package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import pe.edu.upc.trabajo_parcial_grupo3.entities.Employee;

import java.util.List;

public class UsuarioDTO {
    private Long id;
    private String username;

    private String password;
    private Boolean enabled;

    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Employee> getRoles() {
        return employees;
    }

    public void setRoles(List<Employee> roles) {
        this.employees = roles;
    }


}
