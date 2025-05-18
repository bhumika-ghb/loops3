public class Neon{
	public static void getneonNumber(int num){
		int sum=0;
		int temp=0;
		int result=0;
		while(result!=0){
			result=num*num;
			sum+=result%10;
			result=result/10;
		}
		System.out.println((temp==sum)?"Neon number":"not Neon Number");
	}
	public static void main(String[] args){
			getneonNumber(9);
	}
}										