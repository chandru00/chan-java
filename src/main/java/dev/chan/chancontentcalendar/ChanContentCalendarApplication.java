package dev.chan.chancontentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import dev.chan.chancontentcalendar.config.ContentCalendarProperties;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
public class ChanContentCalendarApplication {

	public static void main(String[] args) {
	    SpringApplication.run(ChanContentCalendarApplication.class, args);
	}


//
//    @Bean
//    CommandLineRunner commandLineRunner(ContentRepository repository) {
//        return (args -> {
//            Content content = new Content(null, "Hello Chat GPT", "All about chat gpt", Status.IDEA, Type.VIDEO, LocalDateTime.now(),
//                                          null, "");
//            repository.save(content);
//        });
//    }

}
