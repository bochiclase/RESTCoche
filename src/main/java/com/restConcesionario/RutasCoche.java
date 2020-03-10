package com.restConcesionario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasCoche {

	@GetMapping("/mostrarCoche")
	public Coche coche() {
		Coche coche = new Coche();
		coche.setMarca("Renault");
		coche.setModelo("Megane");
		coche.setColor("azul");
		coche.setCaballos("110");
		return coche;
		
	}
	
	@PostMapping("/cargarCoche")
	public ResponseEntity <Coche> coche(@RequestBody Coche coche) {
			System.out.println(coche);
			return new ResponseEntity<Coche>(coche,HttpStatus.OK);
	}
	
	/**
{
	"modelo":"A110",
	"marca":"Mercedes",
	"color":"Gris",
	"caballos":"200"
}
	  **/
	
}
