package studyspring.cn.djb.MixdDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(SoundSysCon.class);//��xml���õ���Java�����ļ�
		
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext();//��Java���õ���xml�����ļ�
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("studyspring/cn/djb/MixdDI/beans.xml");
		CDPlayer player = context.getBean(CDPlayer.class);
		player.play();
	}

}
