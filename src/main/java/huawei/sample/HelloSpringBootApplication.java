package huawei.sample;

import huawei.sample.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {

	@Autowired
	static Config config;
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}


}
