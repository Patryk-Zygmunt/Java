

class Osoba{
	private int nr;
	private	String name;
	private	String surname;
	private String pesel;
	
	public  void setName( String name ){
		this.name=name;
		
	}
	public  void setSurname( String surname ){
		this.surname=surname;
		
	}
	public  void setPesel( String pesel ){
		this.pesel=pesel;
	}
		
		
	public  void setNr( int nr ){
			this.nr=nr;
			
		}
	
	public int getNr() {
		return nr;
	}
	public String getSurname() {
		return surname;
	}
	public String getPesel() {
		return pesel;
	}
	
	
   
	public String getName() {
		return name;
	}
			
	public String toString(){
		return getName()+" "+surname+" nr:"+nr+" Pesel:"+pesel;}
	
	
}
	