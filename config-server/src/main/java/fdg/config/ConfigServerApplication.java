package fdg.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServerApplication
 * @Description TODO
 * @Author Admin
 * @Date 2019/7/23 12:21
 * #@Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String [] args){
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
