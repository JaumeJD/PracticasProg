package login;

public class Login {
	public boolean login(String nombre, String clave) {
		if (nombre.equals("juan") && clave.equals("123456")) {
			return true;
		} else {
			return false;
		}
	}
}
