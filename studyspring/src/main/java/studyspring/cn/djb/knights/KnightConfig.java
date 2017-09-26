package studyspring.cn.djb.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	@Bean
	public Quest quest() {
		return new KillDragonQuest(System.out);
	}
	
}
