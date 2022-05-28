package tr.com.cakmak.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PoolOfLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoolOfLifeApplication.class, args);
	}

}
