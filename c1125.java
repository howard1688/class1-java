import java.lang.Math;
public class c1125{
	public static void main(String[] args){
		 /*i=1;i<=9;i++*/
		for(int i=-4;i<=4;i++){
				for(int j=-5;j<=5;j++){ /*int j=1;j<=11;j++*/
					int o=-2;
					if(/*i<=6-j||j>=6+i||i>3+j||i+2<=j*/Math.abs(i)+Math.abs(j)>4){
					System.out.print("*");
					o++;
					}		
					else
					{
					System.out.print(" ");
					}
					
				}
		System.out.println(" ");		
		}
		
	}
	
}

//				 i  j
//               6 10 6 11
//7/7  7/8  7 9  7 10 7 11
//8/7  8 8  8 9  8 10 8 11
//9 7  9 8  9 9  9 10 9 11