package studyspring.cn.djb.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
//
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(KnightConfig.class);
		    ClassPathXmlApplicationContext context = 
		        new ClassPathXmlApplicationContext(
		            "studyspring/cn/djb/knights/knights.xml");
		    //Knight knight = (Knight)context.getBean("knight");
		     Knight knight = context.getBean(Knight.class);
		    knight.embarkOnQuest();
		    context.close();
		  } 

		}
		 