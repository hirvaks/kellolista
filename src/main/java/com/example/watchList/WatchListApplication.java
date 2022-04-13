package com.example.watchList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.watchList.domain.Watch;
import com.example.watchList.domain.WatchRepository;

@SpringBootApplication
public class WatchListApplication {
	
	private static final Logger log = LoggerFactory.getLogger(WatchListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WatchListApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner defaultWatches(WatchRepository wrepository) {
		return (args) -> {
			log.info("### ADDING DEFAULT WATCHES");
			wrepository.save(new Watch("brand1", "name1", "movementType1", 38, 1234));
			wrepository.save(new Watch("brand2", "name2", "movementType2", 42, 4321));
		};
	}
}