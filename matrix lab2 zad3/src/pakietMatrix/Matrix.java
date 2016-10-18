package pakietMatrix;


import java.util.Arrays;

public class Matrix {
	int[][] macierz;
	
	   
	public void eye(int n){
		macierz=new int[n][n];
		for(int i=0;i<macierz.length;++i)
		Arrays.fill(macierz[i],7);
	}
	
    public void print(){
    	for(int i=0;i<this.macierz.length;++i){
        	for(int j=0;j<this.macierz[i].length;++j)
        		System.out.print(macierz[i][j]+" ");
        	System.out.println("");  }
    }

   public static void main(String[] args){
	   
	   Matrix M=new Matrix();
	   M.eye(3);
	   M.print();
	   
	   
	   
   }
}