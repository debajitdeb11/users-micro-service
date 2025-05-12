package in.trelic.user_service_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServiceMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceMicroApplication.class, args);
	}

}
