// java program to implement two stack 

class TwoStacks{
	int[] arr;
	int size;
	int top1 ,top2;
	
	
	TwoStacks(int n){
		
		 size = n ; 
		arr = new int[n];
		top1 = n/2 +1;
		top2 = n/2;
		
		
	}
	void push1(int x)
	{
		
		if (top1 > 0){
			
			top1--;
			arr[top1] = x;
			
		} else
		{
			
			System.out.println("Stack overflow"  );
			return;
			
		}
	}
	 
	 void push2(int x)
	 {
		 
		 
		 if(top2 < size-1){
			 top2++;
			 arr[top2]= x;
			 
			 
		 } else{
	 
	
			System.out.println("Stack overflow    "  );
			return;
	 }
}
   int pop1()
   {
	   if(top1 <= size/2)
	   {
		   
	   int x = arr[top1];
	   top1++;
	   return x;
	   
		   
	   } else 
	   {
		   System.out.println("Stack underflow"  );
		   System.exit(1);
		   
	   }
	   return 0;
	   
   }
   int pop2(){
	   
	   if(top2 >= size/2 +1)
	   {
		   
		   int x = arr[top2];
		   top2--;
		   return x;
		   
	   }else
	   {
		   System.out.println("Stack underflow"  );
		   System.exit(1); 
		   
	   } return 1;
   }

  public static void main(String... args){
	  TwoStacks tt = new TwoStacks(5);
	  tt.push1(5);
	  tt.push2(10);
	  tt.push2(15);
	  tt.pop2();
	  tt.pop2();
	  tt.push1(11);
	  tt.push2(7);
	  tt.push2(40);
	 
	  
	  
	
	 System.out.println("Popped element from stack1 is " +tt.pop1() ); 
	 System.out.println("Popped element from stack2 is " +tt.pop2() );

	
  }
}