package com.infosys.timetracker.eim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)
public class EimApplication {

    public static void main(String[] args) {
        SpringApplication.run(EimApplication.class, args);
    }

}
