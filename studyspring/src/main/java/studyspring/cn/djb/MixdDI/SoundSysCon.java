package studyspring.cn.djb.MixdDI;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:studyspring/cn/djb/MixdDI/beans.xml")
//@Import ( {CDCon.class,CDPlayerCon.class})
@Import ( CDPlayerCon.class)
public class SoundSysCon {

}
