package th.ac.utcc.cpe.Tanapong;

/**@Tanapong_Ruengwattanawisit_5907101019
 */
import java.lang.reflect.Array;
import java.util.*;

public class generic <T extends Comparable<T>> {
	private T [] element;
	private int eSize;
	
	public generic(Class <T> myclass,int size){

		if(size>0){
		element = (T[])Array.newInstance(myclass,size);	
		}
		else
			element = (T[])Array.newInstance(myclass,10);
		eSize=0;
	}
	    
	public void insert(T e){
		this.element[eSize] = e;
		eSize++;
	}
	
		public void show(){
		for(int i = 0 ; i < eSize ; i++){
			System.out.println(this.element[i]+ " ");
		}
		System.out.println(" ");
	}		
		
		/*public void selectionSort(){
			int out,in,min;
			
			
			for(out=0 ; out<eSize-1; out++){
				min = out;
				for(in=out +1 ; in< eSize ; in++){
					if(this.element[in].compareTo()==-1){
						min=in;
					}
					this.swap(out,min);
				}
			}
		}*/
		
	    private <T> void swap(T[] a, int L, int R) {
	        if (L != R) {
	            T temp = a[L];
	            a[L] = a[R];
	            a[L] = temp;
	        }
	    }
	    
	public void insertionSortHightoLow(){
		int out,in;
		T temp;
		
		for(out=1 ; out<eSize; out++){
			temp = this.element[out];
			for(in = out;in>0 && this.element[in-1].compareTo(temp)==-1;in--){
				this.element[in]=this.element[in-1];
		}
		this.element[in]=temp;
		}
	}
	
	   // generic method printArray
		//only can print if it's a normal Array
	   public static <T> void printArray( T[] inputArray ) {
	      // Display array elements
	      for(int i=0; inputArray.length > i ;i++) {
	    	  
	         System.out.print(inputArray[i]+" ");
	      }
	      
	      System.out.println();
	   }

public static void main(String[]args){ 
	int max = 20;
	
	generic <Integer> test1 = new generic <Integer>(Integer.class,max);
	
	test1.insert(1);
	test1.insert(8);
	test1.insert(18);
	test1.insert((int)12.0);
	test1.insert((int)97.0);
	test1.insert((int)38.0);
	System.out.println("original Order was");
	test1.show();
	System.out.println("After Insertion is");
	test1.insertionSortHightoLow();
	test1.show();
	
}
}

// get code form Mukya but i have already tested this code 
