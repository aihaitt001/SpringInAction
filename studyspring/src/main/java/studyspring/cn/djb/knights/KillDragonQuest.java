package studyspring.cn.djb.knights;

import java.io.PrintStream;

public class KillDragonQuest implements Quest{
	 private PrintStream stream;

	public KillDragonQuest(PrintStream stream) {
		// TODO Auto-generated constructor stub
		this.stream = stream;
	}

	
	public void embark() {
		// TODO Auto-generated method stub
		stream.println("Embarking on quest to kill the dragon!");
	}

	

	
	

}
