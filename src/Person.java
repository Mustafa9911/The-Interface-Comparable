
public class Person {
	
	private String f�rNamn;
	private String efterNamn;
	
	public Person(String namn){
		
		int index = namn.split(" ").length;
		
		this.f�rNamn = namn.split(" ")[index-1];
		
		this.efterNamn="";
		
		for(int i =0;i<index-1;i++) this.efterNamn += namn.split(" ")[i] + " ";
	
	}
	
	public String getF�rNamn() {
		return f�rNamn;
	}
	public String getEfterNamn() {
		return efterNamn;
	}

}
