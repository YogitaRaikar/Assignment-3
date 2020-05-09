import java.util.Vector;;

public class MaxHeap {

	static Vector<Character> maxheap(Vector<Character> h,int n){ 
		//maxheap function to build MaxHeap
		
		int i,k,j;
		boolean heap;
		char v;
		
		// MaxHeap algorithm
	    
		for(i=n/2;i>=1;i--){
	    	k=i;
	    	v=h.get(k);
		    heap=false;
		    
		    while(!heap&&2*k<=n){
		    	j=2*k;
		    	
		    	if(j<n){
		    		if(h.get(j)<h.get(j+1))
		    			j=j+1;
		    		   }
		    	
		    	if(v>=h.get(j))
		    		heap=true;
		    	
		    	else{
		    		h.set(k,h.get(j));
		    		k=j;
		    		}
			
			}
		
		    h.set(k,v);
		    
	    }
	
	    return h;   //returns character vector after maxheap is built
	}


	public static void main(String[] args) {
		// TODO maxheap
		
		int i,j,n;
		
		n=args[0].length();
		Vector<Character> h=new Vector<Character>();      //"h" to build max-heap 
		h.add(0,null);
		
		//stores each letter of first name in character vector "h"
		for(i=1;i<=n;i++)
			h.add(args[0].charAt(i-1));              
		
		//builds maxheap for first name entered
		h=maxheap(h,n);
		System.out.println("Max heap for first name is:");
		for(i=1;i<=n;i++)
		{
			System.out.print(h.get(i)+" ");
		}
		System.out.println();
		
		//builds maxheap for remaining names by taking each letter from the name 
		for(i=1;i<args.length;i++){
			for(j=0;j<args[i].length();j++){
				n=n+1;
			h.add(args[i].charAt(j));
			h=maxheap(h,n);
			}
		}
		
		//displays final built maxheap of all the entered names
		System.out.println("Final Max heap is:");
		for(i=1;i<=n;i++)
		{
			System.out.print(h.get(i)+" ");
		}
		
		System.out.println();
		
	}

}
