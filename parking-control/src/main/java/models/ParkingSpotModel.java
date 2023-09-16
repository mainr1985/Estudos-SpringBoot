package models;
//anotações jpa serão usadas pra criar o mapeamento e transformar essa classe em entidade no bd 

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; //costumava ser javax ao invés de jakarta

@Entity 
@Table( name = "TB_PARKING_SPOT")
//usa serializable por causa de conversões que serão realizadas 'debaixo dos panos' pra conversões de dados em bytes pra guardar no bd
public class ParkingSpotModel  implements Serializable{
	private static final long serialVersionUID = 1L; //é um controle das conversões feito pela JVM	

	@Id //pra especificar que esse campo será o identificador da entidade. Dá erro na classe se não colocar. 
	@GeneratedValue(strategy=GenerationType.AUTO) //auto increment
	private UUID id; //UUID universais, que podem ser gerados em qqr lugar sem risco de conflito; são próprios pra arquitet. distribuída
	
	@Column(nullable = false, unique = true, length = 10) //criando uma nova coluna
	private String parkingSpotNumber;
	
	@Column(nullable = false, unique = true, length = 7)
	private String licencePlateCar;
	
	@Column(nullable = false, length=70)
	private String brandCar;
	
	@Column(nullable = false, length=70)
	private String modelCar;
	
	@Column(nullable = false, length=70)
	private String colorCar;
	
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	
	@Column(nullable = false, length = 130)
	private String responsibleName;
	
	@Column(nullable = false, length = 30)
	private String apartment;
	
	@Column(nullable = false, length = 30)
	private String block;

	//getters e setters
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public String getLicencePlateCar() {
		return licencePlateCar;
	}

	public void setLicencePlateCar(String licencePlateCar) {
		this.licencePlateCar = licencePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	
	
	
}
