package studyspring.cn.djb.knights;

public class BraveKnight implements Knight{

	private Quest quest;
	
	public  BraveKnight(Quest quest) {//ע��Quest(����ʽע��)
		// TODO Auto-generated method stub
		this.quest = quest;
		
	}
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
		
	}
	

}
