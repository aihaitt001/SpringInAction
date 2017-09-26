package studyspring.cn.djb.MixdDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(SoundSysCon.class);//把xml配置导入Java配置文件
		
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext();//把Java配置导入xml配置文件
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("studyspring/cn/djb/MixdDI/beans.xml");
		CDPlayer player = context.getBean(CDPlayer.class);
		player.play();
	}

}
