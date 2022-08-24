package com.TheDummiesDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication

//Clase principal (main) de nuestro proyecto
public class JacApplication {

	public static void main(String[] args) {

		//SpringApplication.run(JacApplication.class, args);
		Jac Jac1 = new Jac ("La Prosperidad","cl 3 # 3-27","727 6420","1134-5");
		System.out.println(Jac1.getNombreJac());
		System.out.println(Jac1.getDireccionJac());
		System.out.println(Jac1.getTelefonoJac());
		System.out.println(Jac1.getNitJac());
        System.out.println("-------------");
		Empleado empleado1 = new Empleado("Marcos Bautista","macondo777@hotmail.com","La prosperidad","Administrador");
		System.out.println(empleado1.getNombreEmpleado());
		System.out.println(empleado1.getRolJuntaAccionComunal());
		System.out.println("------------");
		MovimientoDinero ingreso1 = new MovimientoDinero(20000,"donativo","Marcos Bautista");
		System.out.println(ingreso1.getMontoMovimiento());
		System.out.println(ingreso1.getConceptoMovimiento());
		System.out.println(ingreso1.getUsuarioRegistraMovimiento());

	}

}
