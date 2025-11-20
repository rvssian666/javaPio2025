package inhiritance;

import java.time.Year;

public class Mascotas {
		
		private String nombre;
		private int anyoNacimiento;
		/**
		 * Contructor de classe Mascotas
		 * @param nombre
		 * @param anyoNacimiento
		 */
		public Mascotas(String nombre, int anyoNacimiento) {
			super();
			this.nombre = nombre;
			this.anyoNacimiento = anyoNacimiento;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getAnyoNacimiento() {
			return anyoNacimiento;
		}
		public void setAnyoNacimiento(int anyoNacimiento) {
			this.anyoNacimiento = anyoNacimiento;
		}
		public int getEdad() {
			return ((Year.now().getValue()) - this.anyoNacimiento);
		}
		@Override
		public String toString() {
			return "Mascotas [nombre=" + nombre + ", anyoNacimiento=" + anyoNacimiento + "]";
		}
		
		public void habla(String paramMensaje) {
			System.out.println(paramMensaje);
		}
		
	 
	}
	 

