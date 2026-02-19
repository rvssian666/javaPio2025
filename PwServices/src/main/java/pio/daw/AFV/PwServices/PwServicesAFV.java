package pio.daw.AFV.PwServices;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServicesAFV {
	private BasicPasswordEncryptor passwordEncryptor;

	private PwServicesAFV() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
	}

	public String encriptarContraseña(final String contrasenaSinEncriptar) {
		return passwordEncryptor.encryptPassword(contrasenaSinEncriptar);

	}

	public boolean verifyPassword(String pass, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(pass, contrasenaEncriptada);
	}
}
