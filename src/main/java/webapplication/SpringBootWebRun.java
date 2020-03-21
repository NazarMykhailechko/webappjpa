package webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@SpringBootApplication
//implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
public class SpringBootWebRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebRun.class, args);
    }
/*    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/clientsdb?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false")
                .username("root")
                .password("WIN72007@NAZAr")
                .build();
    }
    @Bean
    public ViewResolver viewResolver() {
        final InternalResourceViewResolver r = new InternalResourceViewResolver();
        r.setPrefix("/");
        r.setSuffix(".jsp");
        return r;
    }

    @Override
    public void customize(ConfigurableServletWebServerFactory server) {
        server.setPort(8081);
    }*/
}