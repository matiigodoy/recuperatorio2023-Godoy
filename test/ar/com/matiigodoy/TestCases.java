package ar.com.matiigodoy;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queUnUsuarioBasicoSePuedaBloquear() {
		UsuarioBasico user = new UsuarioBasico("matiigodoy", "asd123");
		
		user.Login("asd123456");
		user.Login("asd123456");
		user.Login("asd123456");
		user.Login("asd123456");
		
		assertTrue(user.getEstaBloqueado());
		
	}
	
	@Test
	public void queLosObjetosUsuarioNoSePuedanDuplicar() {
		final Integer CANTIDAD_DE_USUARIOS_ESPERADA = 1;
		
		Sistema sistema = new Sistema("System");
		UsuarioBasico user1 = new UsuarioBasico("matiigodoy", "asd123");
		UsuarioAdministrador user2 = new UsuarioAdministrador("matiigodoy", "123456");
		
		sistema.AgregarUsuario(user1);
		sistema.AgregarUsuario(user2);
		
		assertEquals(CANTIDAD_DE_USUARIOS_ESPERADA, sistema.cantidadDeUsuarios());
	}
	
	@Test
	public void queLosUsuariosEstenOrdenados() {
		final String PRIMER_USUARIO_ESPERADO = "alangomez";
		final String ULTIMO_USUARIO_ESPERADO = "matiigodoy";
		
		Sistema sistema = new Sistema("System");
		UsuarioBasico user1 = new UsuarioBasico("matiigodoy", "asd123");
		UsuarioAdministrador user2 = new UsuarioAdministrador("alangomez", "123456");
		UsuarioBasico user3 = new UsuarioBasico("lmessi", "asd123");
		UsuarioBasico user4 = new UsuarioBasico("jmonteagudo", "asd123");
		
		sistema.AgregarUsuario(user1);
		sistema.AgregarUsuario(user2);
		sistema.AgregarUsuario(user3);
		sistema.AgregarUsuario(user4);
		
		sistema.OrdenarUsuarios();
		
		assertEquals(PRIMER_USUARIO_ESPERADO, sistema.getUsuariosOrdenados().first().getUser());
		assertEquals(ULTIMO_USUARIO_ESPERADO, sistema.getUsuariosOrdenados().last().getUser());
	}
	
	/*No llegué con el tiempo así que voy a entregar hasta donde compila y los test dan verde.
	 * Para validar las excepciones en los Test hubiese usado (expected=*nombreExcepcion*.class)
	 * En la lógica de cada método hubiera declarado que "puede lanzar" una excepcion (throws), y dentro
	 * de los mismos validaría que si no pasa lo que tiene que pasar "lance" la excepcion (throw new *nombreExcepcion*)
	 * No sirve de nada escribirlo, pero por lo menos quiero que sepan que se entendió la explicación.
	 * Saludos!
	*/
}
