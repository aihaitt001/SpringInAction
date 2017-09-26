package studyspring.cn.djb.XmlDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(CDPlayerCon.class);
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("studyspring/cn/djb/XmlDI/beans.xml");
		CDPlayer player = (CDPlayer)context.getBean("cdplayer");
		player.play();
	}

}
