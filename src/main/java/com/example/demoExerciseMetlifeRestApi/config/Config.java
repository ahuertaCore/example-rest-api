package com.example.demoExerciseMetlifeRestApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Date;

@Configuration
public class Config {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mi_base_de_datos");
        //dataSource.setUsername("root");
        dataSource.setUsername("usuario_autorizado");
        //dataSource.setPassword("");
        dataSource.setPassword("123490");

        return dataSource;
    }
}
