package com.matias.curso.springboot.app.aop.springbootaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* SE PUEDE IMPORTAR Y USAR PERO NO ES NECESARIO YA QUE SE ACTIVA AUTOMATICAMENTE */
// import org.springframework.context.annotation.EnableAspectJAutoProxy;
// @EnableAspectJAutoProxy

@SpringBootApplication
public class SpringbootAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}

}
