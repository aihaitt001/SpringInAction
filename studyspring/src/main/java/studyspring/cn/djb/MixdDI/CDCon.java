package studyspring.cn.djb.MixdDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CDCon {
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers("PDD'power","PDD");
	}
}
