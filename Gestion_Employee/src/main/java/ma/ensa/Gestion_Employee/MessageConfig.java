package ma.ensa.Gestion_Employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages"); // Nom de la base de ressources (sans l'extension .properties)
        messageSource.setDefaultEncoding("UTF-8"); // Encodage par défaut
        return messageSource;
    }
}