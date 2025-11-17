package CursoEstudiante;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String idCurso;
	private List<Estudiante> lstEstudiantes;

	public Curso(String idCurso) {
		super();
		this.idCurso = idCurso;
		this.lstEstudiantes = new ArrayList<>();
	}

	public void addEstudent(Estudiante e) {
		boolean flag = false;
		for (Estudiante aux : lstEstudiantes) {
			if (aux.getName().equals(e.getName())) {
				System.out.println("El estudiante " + aux.getName() + " ya esta en el curso,agregue otro");
				flag = true;
				continue;
			}
		}
		if (!flag)
			lstEstudiantes.add(e);

	}

	public void deleteEstudent(int id) {
		for (int i = 0; i < lstEstudiantes.size(); i++) {
			if (lstEstudiantes.get(i).getId() == id) {
				lstEstudiantes.remove(i);
			}
		}

	}

	public void searchEstudent(int idE) {
		for (Estudiante eaux : lstEstudiantes) {
			if (eaux.getId() == idE) {
				eaux.getInfo();

			}

		}
	}

	public void showInformation() {
		for (Estudiante eaux : lstEstudiantes) {
			eaux.getInfo();
		}

	}

	public double calculateAverage() {
		double notaMedia = 0;
		for (Estudiante aux : lstEstudiantes) {
			notaMedia += aux.getCalifi();
		}
		return notaMedia / lstEstudiantes.size();
	}

	public void showExcellent(double notaExellente) {
		for (Estudiante e : lstEstudiantes) {
			if (e.getCalifi() > notaExellente) {
				e.getInfo();

			}
		}

	}

	public void clearCurso() {
		lstEstudiantes.clear();
	}

}
