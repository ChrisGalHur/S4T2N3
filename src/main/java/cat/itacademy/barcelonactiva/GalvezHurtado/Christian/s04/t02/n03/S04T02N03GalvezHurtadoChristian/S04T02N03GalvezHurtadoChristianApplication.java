package cat.itacademy.barcelonactiva.GalvezHurtado.Christian.s04.t02.n03.S04T02N03GalvezHurtadoChristian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class S04T02N03GalvezHurtadoChristianApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03GalvezHurtadoChristianApplication.class, args);
	}

}
