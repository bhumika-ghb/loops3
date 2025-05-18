public class Factorial{
	public static void getfactorialNumber(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.print("Factorial of" +n );
		System.out.println("is" +fact);
	}
	public static void main(String[] args){
		getfactorialNumber(5);
	}
}