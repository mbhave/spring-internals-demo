package example.helloworld;

import org.springframework.context.annotation.Bean;

class HelloConfiguration {

	@Bean
	HelloMessageProvider messageProvider() {
		return new HelloMessageProvider();
	}

}
