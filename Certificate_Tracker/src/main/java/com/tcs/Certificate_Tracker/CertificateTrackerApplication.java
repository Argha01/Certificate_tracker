package com.tcs.Certificate_Tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class CertificateTrackerApplication 
{
	public static void main(String[] args) 
	{
		System.out.println("Argha Here");
		SpringApplication.run(CertificateTrackerApplication.class, args);
	}
}
