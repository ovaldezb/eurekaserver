package mx.com.grupoarpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplicationApplication.class, args);
	}

}
