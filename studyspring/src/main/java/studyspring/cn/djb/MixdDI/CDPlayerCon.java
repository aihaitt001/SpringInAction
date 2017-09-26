package studyspring.cn.djb.MixdDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import studyspring.cn.djb.AutoDI.MediaPlayer;

@Configuration
public class CDPlayerCon {
	
	
//	@Bean
//	public CDPlayer cdPlayer() {
//		return new CDPlayer(sgtPeppers());
//	}
	

	 @Bean
	  public CDPlayer cdPlayer(CompactDisc cd) {
	    return new CDPlayer(cd);
	  }
	
//	@Bean
//	public CDPlayer cdPlayer(CompactDisc cd) {
//		CDPlayer cdplayer = new CDPlayer(cd);
//		cdplayer.setCompactDisc(cd);
//	}
}
