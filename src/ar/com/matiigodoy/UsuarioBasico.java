package ar.com.matiigodoy;

public class UsuarioBasico extends Usuario implements IBloqueable, IEliminable{

	private Boolean estaBloqueado;
	private Boolean estaEliminado;
	private Integer intentosLogin;
	
	public UsuarioBasico(String user, String pass) {
		super(user, pass);
		setEstaBloqueado(false);
		setEstaEliminado(false);
		setIntentosLogin(0);
	}
	@Override
	public void Login(String pass) {
		if(pass == getPass() && getEstaBloqueado()==false) {
			setEstaLogueado(true);
		} else {
			this.intentosLogin++;
		}
		if (intentosLogin >= 3 && getEstaLogueado()==false) {
			setEstaBloqueado(true);	
		}
	}
	
	@Override
	public void Eliminar() {
		setEstaEliminado(true);
	}

	@Override
	public void Bloquear() {
		setEstaBloqueado(true);
	}

	public Boolean getEstaBloqueado() {
		return estaBloqueado;
	}

	public void setEstaBloqueado(Boolean estaBloqueado) {
		this.estaBloqueado = estaBloqueado;
	}

	public Boolean getEstaEliminado() {
		return estaEliminado;
	}

	public void setEstaEliminado(Boolean estaEliminado) {
		this.estaEliminado = estaEliminado;
	}

	public Integer getIntentosLogin() {
		return intentosLogin;
	}

	public void setIntentosLogin(Integer intentosLogin) {
		this.intentosLogin = intentosLogin;
	}

}
