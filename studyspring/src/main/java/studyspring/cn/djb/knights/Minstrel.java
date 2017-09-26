package studyspring.cn.djb.knights;

import java.io.PrintStream;

public class Minstrel {
	
	
	private PrintStream stream;
	public Minstrel(PrintStream stream) {
		this.stream =stream;
	}
	public void BeforeQuest() {
		stream.println("fa la la,the knight is so brave!");
	}
	public void AfterQuest() {
		stream.println("tee hee hee,the knight did embark!");
	}
}
