package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //tudo entre () serve para evitar o erro "datasource-url-attribute-is-not-specified-and-no-embedd"
@RestController //pra fazer a classe se tornar um bean do tipo controller (necessário inclusive pro Hello World)
public class ParkingControlApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);	
	}
	
	@GetMapping("/") //indica o método http a ser usado pela aplicação. Aqui está setando a rota a ser realizada para '/' (pense Laravel) 
	public String index() {
		return "Hello World Spring Boot!";
	}
}
//a princípio dá whitelabel error se tentar acessar o localhost:8080 porque não foi mapeado o que fazer - precisa criar um controller.
//o spring tem uma ferramenta 'dispatcher service' e sempre que são enviadas requisições pra aplicação/servidor, ele recebe e roteia o controller mais adequado a responder 