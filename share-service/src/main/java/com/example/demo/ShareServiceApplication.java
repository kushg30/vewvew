package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.Share;
import com.example.persistence.ShareDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class ShareServiceApplication implements CommandLineRunner {

	@Autowired
	private ShareDao shareDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ShareServiceApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		shareDao.save(new Share(1,"ICICI",2500));
		shareDao.save(new Share(2,"TATA",8500));
		shareDao.save(new Share(3,"Wipro",3500));
		shareDao.save(new Share(4,"HDFC",4500));
		shareDao.save(new Share(5,"HCL",6500));
		
		//same day (intra day)
		//cash and carry(cnc)
	}

}