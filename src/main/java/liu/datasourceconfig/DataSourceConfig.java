package liu.datasourceconfig;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	 @Bean(name = "test1")
	    @ConfigurationProperties(prefix = "test1") // application.properteis中对应属性的前缀
	    public DataSource dataSource1() {
	        return DataSourceBuilder.create().build();
	    }




	    @Bean(name = "test2")
	    @ConfigurationProperties(prefix = "test2") // application.properteis中对应属性的前缀
	    public DataSource dataSource2() {
	        return DataSourceBuilder.create().build();
	    }

}
