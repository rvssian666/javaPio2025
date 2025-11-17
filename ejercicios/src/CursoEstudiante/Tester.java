package CursoEstudiante;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante(001, "Juan jose", 9);
		Estudiante e2 = new Estudiante(002, "Rihana", 5);
		Estudiante e3 = new Estudiante(003, "Alicia", 7.6);
		Estudiante e4 = new Estudiante(07, "David", 9);
		Estudiante e5 = new Estudiante(8, "Juan Esteban", 6);
		Estudiante e6 = new Estudiante(10, "Juan Antonio", 8);

		Curso c1 = new Curso("P01");

		c1.addEstudent(e1);
		c1.addEstudent(e2);
		c1.addEstudent(e6);
		//c1.addEstudent(e5);
		c1.addEstudent(e4);
		c1.addEstudent(e5);
		c1.addEstudent(e3);
		//c1.deleteEstudent(7);
		//c1.showInformation();
		//c1.calculateAverage();
		c1.showExcellent(8);
		

	}

}
