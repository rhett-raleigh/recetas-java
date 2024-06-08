package com.rhettraleigh.recetas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RecipeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Recipe("Spring Rolls",
                    "Rice paper with vegetables", "Rice paper, lettuce, carrots")));
            log.info("Preloading " + repository.save(new Recipe("Pad Thai",
                    "Thai curry with rice, bean sprouts, and vegetables", "curry, rice, bean sprouts, vegetables")));
            log.info("Preloading " + repository.save(new Recipe("Panang Curry",
                    "red Thai curry that is thick, salty and sweet, with a zesty makrut lime flavour", "curry, lime")));
        };
    }
}
