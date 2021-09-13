package tn.inetum.RecruitmentProcess;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import boostrap.SwaggerConfiguration;


@Import(SwaggerConfiguration.class)
@SpringBootApplication
public class RecruitmentProcessApplication   {

	
	 
	public static void main(String[] args) {
		SpringApplication.run(RecruitmentProcessApplication.class, args);
	}
	
	

}
