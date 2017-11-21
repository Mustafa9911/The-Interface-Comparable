
public class Person implements Comparable<Person>{
	
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

	@Override
	public int compareTo(Person per) {

		if(this.getEfterNamn().equals(per.getEfterNamn())){
						
			return this.getFörNamn().compareTo(per.getFörNamn());
	
		}else{
			
			return this.getEfterNamn().compareTo(per.getEfterNamn());
			
		}
				
		
	}

}
