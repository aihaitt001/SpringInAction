package studyspring.cn.djb.XmlDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BlankCD implements CompactDisc{
	private String title;
	private String artist;
	
	public BlankCD(String title,String artist) {
		this.title = title;
		this.artist = artist;
	}
	public void play() {
		System.out.println("playing "+title+" by "+artist);
	}
}
