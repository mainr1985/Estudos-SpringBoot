package controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.ParkingSpotService;

@RestController
@CrossOrigin (origins = "*" , maxAge=3600) //????
@RequestMapping("/parking-spot")		//definindo a URI a nível de classe -> mapeando a rota (pense laravel)

public class ParkingSpotController {
	
	//precisa criar um ponto de injeção do service aqui dentro
	
	final ParkingSpotService parkingSpotService;

	public ParkingSpotController(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}
	
}
