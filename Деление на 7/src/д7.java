import java.util.Scanner;
public class д7 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Провери, дали числото/а се дели/ят на 7 и разбери колко е резултата, ако се дели ");
		System.out.println("Въведи числото а: ");
		long a= input.nextLong();
		if (a%7==0) {
			System.out.println("Числото " + a + " се дели на 7 и е: ");
		System.out.println(a/7);}
		else {
			System.out.println("Числото "+ a+ " не се дели точно на 7!");}
			
		
		input.close();
		

	}

}