package rcb.ebbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@PropertySources({@PropertySource({"classpath:application.yml"})})
public class FoodDeliveryApplication extends SpringBootServletInitializer implements WebApplicationInitializer{

    public static void main(String[] args) {
        SpringApplication.run(FoodDeliveryApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FoodDeliveryApplication.class);

    }
    
    public FoodDeliveryApplication(){
    	this.setRegisterErrorPageFilter(false);
    	}
}