public class Armstrong{
	public static void armstrongNumber(int i){
		int temp=i;
		int sum=0;
		int count=0;
		while(i!=0){
			int rem=i%10;
			sum+=(rem*rem*rem);
			i/=10;
			count++;
		}
		System.out.println((temp==sum)?"amstrong number":"not amstrong number");

	}
		public static void main(String[] args){
			Armstrong obj=new Armstrong();
			obj.armstrongNumber(153);
		}
}

		
	
		