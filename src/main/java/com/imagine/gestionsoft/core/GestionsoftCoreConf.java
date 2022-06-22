package com.imagine.gestionsoft.core;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = { "com.imagine.gestionsoft.core" })
@EnableJpaRepositories({ "com.imagine.gestionsoft.core.repository" })
@EntityScan({ "com.imagine.gestionsoft.core.entity" })
public class GestionsoftCoreConf {

}
