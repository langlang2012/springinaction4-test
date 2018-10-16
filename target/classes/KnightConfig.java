import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.mock.BraveKnight;
import test.mock.Knight;
import test.mock.Quest;
import test.mock.SlayDragonQuest;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
