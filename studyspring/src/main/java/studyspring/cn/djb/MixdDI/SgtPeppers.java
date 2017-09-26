 package studyspring.cn.djb.MixdDI;

import org.springframework.stereotype.Component;


public class SgtPeppers implements CompactDisc{
	private String title="null";
	private String artist="null";
	public SgtPeppers (String title,String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing "+title+" by " +artist);
	}

}
