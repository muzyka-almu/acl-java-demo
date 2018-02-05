package by.almu.acljavademo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "by.almu.acljavademo.model")
@EnableJpaRepositories(basePackages = "by.almu.acljavademo.dao")
@ComponentScan({
		"by.almu.acljavademo.config",
		"by.almu.acljavademo.controller",
		"by.almu.acljavademo.service",
})
public class AclJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AclJavaDemoApplication.class, args);
	}
}
