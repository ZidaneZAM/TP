package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Usuario;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IUser;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserImplement implements IUserService {

    @Autowired
    private IUser uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

}
