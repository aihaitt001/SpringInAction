package studyspring.cn.djb.knights;

public class BraveKnight implements Knight{

	private Quest quest;
	
	public  BraveKnight(Quest quest) {//注入Quest(构造式注入)
		// TODO Auto-generated method stub
		this.quest = quest;
		
	}
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
		
	}
	

}
