package pio.daw.afv.tema6.listCRUD;

public interface AlumnoDAO {
	// Métodos de acceso a los datos: 4 C R U D
	public int create(Alumno nuevoAlum) throws Exception;

	public Alumno read(int niaBuscar) throws Exception;

	public void update(int niaActualizar, Alumno alumnoCambiado) throws Exception;

	public void delete(int niaBorrar) throws Exception;

}
