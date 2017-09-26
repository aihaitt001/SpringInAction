package studyspring.cn.djb.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConcertCon.class);
//		    ClassPathXmlApplicationContext context = 
//		        new ClassPathXmlApplicationContext(
//		            "studyspring/cn/djb/knights/knights.xml");
		    //Knight knight = (Knight)context.getBean("knight");
		     Performance concert = context.getBean(Performance.class);
		    concert.perform();
		    context.close();

	}

}
