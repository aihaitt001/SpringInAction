package studyspring.cn.djb.AOP;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance{

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("sing...");
	}

}
