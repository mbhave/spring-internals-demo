package example.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HelloConfiguration {

	@Bean
	HelloMessageProvider messageProvider() {
		return new HelloMessageProvider();
	}

}
