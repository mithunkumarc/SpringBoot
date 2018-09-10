package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

			//using client, stop current port before use
		/*GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());*/
	}
}
