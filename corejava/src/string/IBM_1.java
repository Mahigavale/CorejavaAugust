package string;

public class IBM_1 {

	public static void main(String[] args) {
	

		/**
		 * 
		 * peter 4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4
		 * john  0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,6,6,6,6   //13 || -1 
		 * 
		 * john>peter no.of problems  || -1
		 * 
		 * 
		 */
		
		//5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5
		//0,0,0,0,0,0,0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7
		              //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
		int i=IBM_q.calc(30,31);
    System.out.println(i);
		//2,2,2
		//   ,2
	}

}

class IBM_q
{
	                     // 5,8
	                     //2,4
	public static int calc(int pq,int jd)
	{
		 if(jd <=pq)
		 {
			 return -1;
		 }
		 if(jd-pq==1)
		 {
			 return -1;
		 }
		    
		 int pq_sum=pq*(jd-1);
		 int jq_sum=jd-1;
		 int counter=1;
		 
		 while(jq_sum<=pq_sum)
		 {
			 ++counter;
			 pq_sum=pq_sum+pq;
			 jq_sum=jq_sum+(jd-1);
			 
			 System.out.println("pq:"+pq_sum);
			 System.out.println("jq:"+jq_sum);
			 System.out.println("day:"+counter);
			 System.out.println("*********DAY FINISHED..");
		 }
		 return counter;
	}
}
