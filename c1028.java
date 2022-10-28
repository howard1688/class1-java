import java.util.Scanner;
public class c1028{
	public static void main(String[] args){
		int i,a;
		/**/
		for(i=0;i<6;i++){
			for(a=6+i;a>i;a--){
				if (i+1<a-i){
					System.out.printf("*");					
				}
				else
				{
					System.out.printf("%d",a-i);
				}
				//a=a-i
			}	
			System.out.println();
		}
		/**/
		for(i=1;i<7;i++){
			for(a=-5+i;a<=i;a++){
				if (a<1){
					System.out.printf("*");					
				}
				else
				{
					System.out.printf("%d",a);
				}
				//a=a-i
			}
			
			System.out.println();
		}
		/**/
		for(i=0;i<6;i++){
			for(a=5;a>=0;a--){
				if (a>i){
					System.out.printf("*");					
				}
				else
				{
					System.out.printf("%d",i-a+1);
				}
			}
			
			System.out.println();
		}
	}
}
	