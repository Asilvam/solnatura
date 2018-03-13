
package controller.modelos;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conectar
{  
      public DriverManagerDataSource conectar()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        //dataSource.setUrl("jdbc:postgresql://192.168.0.11:5432/postgres");
        //dataSource.setUrl("jdbc:postgresql://192.168.0.11:5432/postgres");
        dataSource.setUrl("jdbc:postgresql://asilvam.ddns.net:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");
        return dataSource;      
    }
}
