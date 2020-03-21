package webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
public class SpringBootWebRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebRun.class, args);
    }

//    @Bean
//    public BasicDataSource dataSource() throws URISyntaxException {
//        URI dbUri = new URI(System.getenv("CLEARDB_DATABASE_URL"));
//
//        String username = dbUri.getUserInfo().split(":")[0];
//        String password = dbUri.getUserInfo().split(":")[1];
//        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + dbUri.getPath();
//
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setUrl(dbUrl);
//        basicDataSource.setUsername(username);
//        basicDataSource.setPassword(password);//
//        return basicDataSource;
//    }

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