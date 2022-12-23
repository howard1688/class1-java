import java.util.Scanner;
public class test1{
	public static void main(String[] args){
		int[] arr={7,5,4,9,8,1,2};
		int[] flag=new int[arr.length];
		float[] ha=new float[arr.length];
		if (arr.length%2==0){
			arr[arr.length+1]=arr[arr.length];
		}
		int mid=0;
		int fg=1;
		int num=0;
		float haa;
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d",flag[i]);
			System.out.println("/"+arr[i]);	
		}
		Scanner input= new Scanner(System.in);
		num= input.nextInt();
		for(int j=0;j<num;j++){
			int min=100000;
			int min_in=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]<min&&flag[i]==0){
					min=arr[i];//arr數值
					min_in=i;//arr位址
				}
			}
			flag[min_in]=fg;//取代為1
			fg++;
			mid=arr[min_in];
			}
			
			System.out.println(mid);
			for(int i=1;i<7;i++){
				haa=(arr[i-1]+arr[i]);
				ha[i]=haa/2;
				//System.out.printf("%f",ha);
			}
			for(int i=1;i<7;i+=2){
				System.out.println(ha[i]);
			}
				System.out.println(arr[6]);
		}
	
}
