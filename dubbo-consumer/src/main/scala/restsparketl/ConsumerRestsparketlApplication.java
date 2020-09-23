package restsparketl;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@DubboComponentScan(basePackages = "restsparketl.controller")
public class ConsumerRestsparketlApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerRestsparketlApplication.class, args);
	}
	}

