package ar.com.matiigodoy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sistema {
	private String nombre;
	private HashSet<Usuario> usuarios;
	private TreeSet<Usuario> usuariosOrdenados;
	
	public Sistema (String nombre) {
		this.nombre = nombre;
		usuarios = new HashSet<Usuario>();
		usuariosOrdenados = new TreeSet<Usuario>();
	}
	
	public void AgregarUsuario(Usuario user) {
		usuarios.add(user);
	}
	
	public Integer cantidadDeUsuarios() {
		return usuarios.size();
	}
	
	public HashSet<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public void OrdenarUsuarios() {
		usuariosOrdenados.addAll(usuarios);
	}
	
	public TreeSet<Usuario> getUsuariosOrdenados() {
		return usuariosOrdenados;
	}

}
