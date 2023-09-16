package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.ParkingSpotModel;

//JPARepository recebe como parâmetros o Modelo que será usado e o ID que foi utilizado nesse modelo
//já possui vários métodos prontos para serem usados em transações com o BD, por isso foi usada a herança aqui.
@Repository //nesse caso não precisaria, porque já vem com o JpaRepository, só pra ficar certinho mesmo.
public interface ParkingSpotRepository  extends JpaRepository<ParkingSpotModel, UUID>{
	
}
