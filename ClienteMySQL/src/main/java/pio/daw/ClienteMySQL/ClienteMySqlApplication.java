package pio.daw.ClienteMySQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pio.daw.ClienteMySQL.laliga.model.Equipo;
import pio.daw.ClienteMySQL.laliga.repository.EquipoRepository;

@SpringBootApplication
@RestController
public class ClienteMySqlApplication implements CommandLineRunner {
	@Autowired
	EquipoRepository equipoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ClienteMySqlApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
	
		// Insertar un nuevo equipo
		/*Equipo equipo1 = new Equipo();
		equipo1.setNombreEquipo("Real Madrid");
		equipo1.setCiudad("Madrid");
		equipo1.setNombreCampo("Santiago Bernabeu");
		equipoRepository.save(equipo1);
		System.out.println("Equipo Insertado " + equipo1);
		// Insertar un nuevo equipo
		Equipo equipo2 = new Equipo();
		equipo2.setNombreEquipo("Atletico Madrid");
		equipo2.setCiudad("Madrid");
		equipo2.setNombreCampo("Wanda Metropolitano");
		equipoRepository.save(equipo2);
		System.out.println("Equipo Insertado " + equipo2);
		// Insertar un nuevo equipo
		Equipo equipo3 = new Equipo();
		equipo3.setNombreEquipo("Bayern Munchen");
		equipo3.setCiudad("Munich");
		equipo3.setNombreCampo("Alianz Arena");
		equipoRepository.save(equipo3);
		System.out.println("Equipo Insertado " + equipo3);
*/
		List<Equipo> listaTodosLosEquipos = equipoRepository.findAll();
		for (Equipo equipo : listaTodosLosEquipos)
			System.out.println("Equipo de BBDD " + equipo);
	}

	@GetMapping("/listado")
	public String listarClientes() {
		StringBuffer sbOut=new StringBuffer();
		sbOut.append("<html><body>");
		sbOut.append("<h1> Listado de Equipos </h1>");
		sbOut.append("------------------");
		for (Equipo equipo : equipoRepository.findAll()) {
			sbOut.append("<h4>");
			sbOut.append(equipo);
			sbOut.append("</h4>");
		}
		sbOut.append("</body></html>");
		return String.format(sbOut.toString());

	}

}
