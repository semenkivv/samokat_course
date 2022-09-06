package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(SamokatRepository repository){
        return  args -> {
            log.info("Preloading " + repository.save(new Samokat("98762","Xiaomi","2015.06.12","300W","57266399","06.10--12:30","67M" )));
            log.info("Preloading " + repository.save(new Samokat("3831","Xiaomi","2015.07.10","350W","10665047","06.14--13:50","72M" )));
            log.info("Preloading " + repository.save(new Samokat("14893","Xiaomi","2013.02.23","200W","91921781","06.14--13:50","97M" )));
            log.info("Preloading " + repository.save(new Samokat("58003","LG","2017.04.05","400W","50137354","06.14--13:50","114M" )));
            log.info("Preloading " + repository.save(new Samokat("23937","LG","2018.03.12","500W","28194128","06.14--13:50","77M" )));
            log.info("Preloading " + repository.save(new Samokat("88224","LG","2014.02.22","200W","93103393","06.14--13:50","107M" )));
            log.info("Preloading " + repository.save(new Samokat("32519","Huawei","2018.01.15","200W","95928075","06.14--13:50","58M" )));
            log.info("Preloading " + repository.save(new Samokat("90541","Huawei","2016.09.30","100W","67234614","06.14--13:50","69M" )));
            log.info("Preloading " + repository.save(new Samokat("28253","Baisheng","2020.02.10","1000W","21394050","06.14--13:50","154M" )));
            log.info("Preloading " + repository.save(new Samokat("46168","Baisheng","2021.08.18","750W","61837230","06.14--13:50","36M" )));

        };
    }
}
