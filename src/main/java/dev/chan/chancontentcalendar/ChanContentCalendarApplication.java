package dev.chan.chancontentcalendar;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import dev.chan.chancontentcalendar.config.ContentCalendarProperties;
import dev.chan.chancontentcalendar.model.Content;
import dev.chan.chancontentcalendar.model.Status;
import dev.chan.chancontentcalendar.model.Type;
import dev.chan.chancontentcalendar.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
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
