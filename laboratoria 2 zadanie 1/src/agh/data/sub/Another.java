package agh.data.sub;
import agh.data.Base;

public class Another {
	private Base baza;
	
	public void callBaseIncrement(){
		baza.callIncrement();
	}

	public void callBaseDecrement(){
		baza.callDecrement();
	}

	public void callBaseChangeName(String Name){
		baza.callChangeName(Name);
	}

}