
public class Person {
	
	private String förNamn;
	private String efterNamn;
	
	public Person(String namn){
		
		int index = namn.split(" ").length;
		
		this.förNamn = namn.split(" ")[index-1];
		
		this.efterNamn="";
		
		for(int i =0;i<index-1;i++) this.efterNamn += namn.split(" ")[i] + " ";
	
	}
	
	public String getFörNamn() {
		return förNamn;
	}
	public String getEfterNamn() {
		return efterNamn;
	}

}
