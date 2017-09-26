package studyspring.cn.djb.AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertCon {
	@Bean 
	public Audience audience() {
		return new Audience();
	}
	@Bean
	public Performance concert() {
		return new Concert();
		
	}
}
