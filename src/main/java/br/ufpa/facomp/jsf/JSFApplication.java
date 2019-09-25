package br.ufpa.facomp.jsf;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.webresources.StandardRoot;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;


@SpringBootApplication
@EnableJpaRepositories("br.ufpa.facomp.jsf.repository")
public class JSFApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JSFApplication.class, args);
    }
}
