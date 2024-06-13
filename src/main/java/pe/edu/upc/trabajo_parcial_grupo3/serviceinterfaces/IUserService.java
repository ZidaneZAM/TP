package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;


import pe.edu.upc.trabajo_parcial_grupo3.entities.Usuario;

import java.util.List;

public interface IUserService {
    public void insert(Usuario usuario);
    public List<Usuario> list();
    public void delete(Long  idUsuario);
    public Usuario listarId(Long idUsuario);

}
