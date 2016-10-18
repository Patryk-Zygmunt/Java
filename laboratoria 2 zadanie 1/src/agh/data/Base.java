package agh.data;

public class Base {
  public int Value ;
  String Name;
    
  public void callChangeName(String Name){
	  changeName(Name);
	  System.out.println("Baza ");
  }
  
  public void callIncrement(){
	  increment();
	
  }
  
  public void callDecrement(){
	  decrement();
	  System.out.println("Baza ");
  }
  
  private void increment(){
	  this.Value+=1;
	  System.out.println("<<<<<Baza>>>>>>>>>>>>>>>><<< ");
  }

    void decrement(){
	  this.Value-=1;
	  System.out.println("<<<<<Baza>>>>>>>>>>>>>>>><<< ");
  }

   void changeName(String Name){
	   this.Name=Name;	   	   
   }
   
   public String toString(){
	   return Value+"   "+Name;  
   }
  public static void main(String[] args){
	 V1 baza=new V1();
	  
	  baza.callChangeName("jakasnazwa");
	  baza.callIncrement();
	  baza.callIncrement();
	  System.out.println(baza);
	  
  }
}




