package inhiritance;

public class Perro extends Mascotas {
		private String raza;
		private boolean tienePulgas;
		/**
		 *
		 * @param nombre
		 * @param anyoNacimiento
		 * @param raza
		 * @param tienePulgas
		 */
		public Perro(String nombre, int anyoNacimiento, String raza, boolean tienePulgas) {
			super(nombre, anyoNacimiento);
			this.raza = raza;
			this.tienePulgas = tienePulgas;
		}
		@Override
		public String toString() {
			return "Perro [raza=" + raza + ", tienePulgas=" + tienePulgas + ", toString()=" + super.toString() + "]";
		}
		
		public void tienePulgas() {
			String mensaje = "El perro";
			mensaje += tienePulgas? "SÍ":"NO";
			mensaje +="tienes pulgas";
			System.out.println(mensaje);
		}
		
		public void calcularVacuna() {
			/* Se calcula el precio según la edad
			 * si es <= 5 años: precio base 20€ y 0,3€ por edad
			 * Entre 6 y 10: precio base 13€ y 0,2€ por edad
			 * 11 o más: precio base 12€ y 0,1€ por edad
			 */
			Perro.super.getEdad();
			
			
		}
		
}
