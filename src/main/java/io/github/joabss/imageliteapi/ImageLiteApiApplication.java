package io.github.joabss.imageliteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImageLiteApiApplication {

//	@Bean
//	public CommandLineRunner commandLineRunner(@Autowired ImageRepository respository) {
//        return args -> {
//			Image image = Image
//					.builder()
//					.extension(ImageExtension.PNG)
//					.name("myimage")
//					.tags("teste")
//					.size(1000L)
//					.build();
//			respository.save(image);
//		};
//    }

	public static void main(String[] args) {
		SpringApplication.run(ImageLiteApiApplication.class, args);
	}

}
