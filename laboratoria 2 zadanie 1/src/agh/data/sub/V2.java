package agh.data.sub;
import agh.data.Base;

public class V2 extends Base {
	
	private void increment(){
		callIncrement();
		System.out.println("V2 ");
	}

	
	protected void decrement(){
		callDecrement();
		System.out.println("V2 ");
	}

	  
	void changeName(String Name){
		callChangeName(Name);
		
	}
	 public static void main(String[] args){
		  V2 baza=new V2();
		  //baza.changeName("jakasnazwa");
		  baza.decrement();
		  baza.decrement();
		  System.out.println(baza);
		  
	  }
	
	
}
