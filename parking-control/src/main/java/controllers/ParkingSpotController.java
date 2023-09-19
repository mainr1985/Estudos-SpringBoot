package controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.ParkingSpotService;

@RestController
@CrossOrigin (origins = "*" , maxAge=3600) //mecanismo usado pra add cabeçalhos http que informam aos navegadores que permitam que uma aplicação web seja executada em uma origem e acesse recursos de outra origem. 
@RequestMapping("/parking-spot")		//definindo a URI a nível de classe -> mapeando a rota (pense laravel)

public class ParkingSpotController {
	
	//precisa criar um ponto de injeção do service aqui dentro
	
	final ParkingSpotService parkingSpotService;

	public ParkingSpotController(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}
	
}
