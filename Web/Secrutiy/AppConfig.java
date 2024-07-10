package sig.agrogeomarket.app.Web.Secrutiy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sig.agrogeomarket.app.Service.Traitement.TraitementESRI;

@Configuration
public class AppConfig {

    @Bean
    public TraitementESRI traitementESRI() {
        return new TraitementESRI();
    }
}