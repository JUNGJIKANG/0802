import java.util.Scanner;

public class Prctice7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫째수 : "); int num1=sc.nextInt();
		System.out.print("둘째수 : "); int num2=sc.nextInt(); 
		int gcm=0;
		for(int i=2; i<num1; i++) {
			if(num1%i==0&&num2%i==0) gcm=i;
		}
		int lcm=(num1/gcm)*(num2/gcm)*gcm;
		System.out.printf("%d와%d의 GCM=%d, LCM=%d\n",num1,num2,gcm,lcm);
	}
}

//<입력>
//첫째수:
//둘째수:
//	<출력>
//	~와~의 최대공약수=~, 최소공베수=~
//	A=aG
//	B=bG
//	L=abG