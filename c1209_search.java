import java.util.Random;
import java.util.Scanner;
public class test1{
	public static void main(String[] args){
		Random r = new Random();
		
		int court=0;
		int aa,num,nump;
		Scanner input= new Scanner(System.in);
		System.out.println("enter array max num");
		num= input.nextInt();
		num+=1;
		System.out.println("enter number what you search");
		nump= input.nextInt();
		int[] a=new int[num];
		for(int i=0;i<num;i++){
			a[i]=i;
		}
		for(int i=1;i<num+1;i++){
			int ran = r.nextInt(num);
			aa=a[i-1];
			a[i-1]=a[ran];
			a[ran]=aa;
		}
		for(int i=0;i<num;i++){
			System.out.printf("%d",a[i]);
			System.out.print(",");
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			court+=1;
			if(a[i]==2){
				System.out.printf("%d",court);
			}
		}
		court=0;
		System.out.println();
		for(int i=(a.length/2);i<num;i++){
			court+=1;
			if(a[i]==nump){
				System.out.print("Binary search");
				System.out.printf("%d",court);
			}
		}
		for(int i=(a.length/2);i>=0;i--){
			court+=1;
			if(a[i]==nump){
				System.out.print("Binary search");
				System.out.printf("%d",court);
			}
		}
		System.out.println();
	}
}
