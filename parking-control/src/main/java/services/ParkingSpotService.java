package services;

import org.springframework.stereotype.Service;
import repositories.ParkingSpotRepository;

//é um intermediário entre o controller e o repository. Vai precisar acionar o repository em alguns casos(salvar, deletar, listar...) 

@Service
public class ParkingSpotService {

	/*@Autowired //esse é um jeito de fazer um ponto de injeção (ponto de acesso ao repository)
	ParkingSpotRepository parkingSpotRepository;*/
	
	//criando o ponto de injeção através de construtor:
	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	} 
	
	
}
