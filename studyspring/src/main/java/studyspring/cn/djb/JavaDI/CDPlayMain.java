package studyspring.cn.djb.JavaDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDPlayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext content = 
				new AnnotationConfigApplicationContext(CDPlayerCon.class);
		CDPlayer player = content.getBean(CDPlayer.class);
		player.play();
	}

}
