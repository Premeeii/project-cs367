package com.train.bookingtool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    public static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

        
    @Bean
    CommandLineRunner setupData(StorageRepository repo) {
        return args -> {
            log.info("loading" + repo.save(new Storage("Bangkok", "6:30", "40")));
            log.info("loading" + repo.save(new Storage("Ayuttaya", "7:30", "100")));
            log.info("loading" + repo.save(new Storage("Chonburi", "8:30", "150")));
            log.info("loading" + repo.save(new Storage("Chaingmai", "4:00", "400")));
            log.info("loading" + repo.save(new Storage("Lopburi", "11:00", "120")));
            log.info("loading" + repo.save(new Storage("Phuket", "5:30", "300")));
        };

    }

}
