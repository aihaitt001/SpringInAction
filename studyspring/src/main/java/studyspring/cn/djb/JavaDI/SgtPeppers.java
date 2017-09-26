 package studyspring.cn.djb.JavaDI;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
	private String title="Sgt.Pepper";
	private String artist="The Beatles";
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing "+title+" by " +artist);
	}

}
