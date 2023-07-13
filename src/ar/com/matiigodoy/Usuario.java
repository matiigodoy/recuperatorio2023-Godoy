package ar.com.matiigodoy;

import java.util.Objects;

public abstract class Usuario implements Comparable<Usuario>{
	protected String user;
	protected String pass;
	protected Boolean estaLogueado;
	
	public Usuario(String user, String pass) {
		this.user = user;
		this.pass = pass;
		this.estaLogueado = false;
	}
	
	abstract void Login(String pass);
	
	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public Boolean getEstaLogueado() {
		return estaLogueado;
	}

	public void setEstaLogueado(Boolean estaLogueado) {
		this.estaLogueado = estaLogueado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(user, other.user);
	}
	
	public int compareTo (Usuario u1) {
		return this.user.compareTo(u1.getUser());
	}
	
	
	
}
