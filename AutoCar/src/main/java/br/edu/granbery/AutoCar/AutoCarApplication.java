package br.edu.granbery.AutoCar;

import br.edu.granbery.AutoCar.model.Carro;
import br.edu.granbery.AutoCar.model.Proprietario;
import br.edu.granbery.AutoCar.model.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AutoCarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AutoCarApplication.class, args);
	}

	@Autowired
	CarroRepository cRepo;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("### SERVER STARTED ###");
//		Proprietario prop = new Proprietario(1,"Carlos", "7070","carlos@gmaill.com");
//		Carro c = new Carro("ABC-7070",2010, "Preta","Fusca","VW",prop);
//		System.out.println("Carro :: " + c.getPlaca());
//
//		cRepo.save(c);
		Carro c1 = cRepo.findById("ABC-7070").get();

		System.out.println("Carro :: " +c1.getPlaca());
		System.out.println("Carro :: " +c1.getModelo());
		System.out.println("Carro :: " +c1.getMarca());
		System.out.println("Carro :: " +c1.getCor());
		System.out.println("Carro :: " +c1.getDono().getNome());

		c1.setCor("Azul");
		cRepo.save(c1);


		List<Carro> velhos = cRepo.carrosAntigos();
		System.out.println("Carros Antigos : ");
		for (Carro c : velhos) {
			System.out.println(c.getPlaca());
		}

	}
}
