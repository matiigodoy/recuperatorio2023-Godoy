package ar.com.matiigodoy;

public class UserNotFoundException extends Exception{
	public UserNotFoundException(String mensaje) {
		super(mensaje);
	}
}
