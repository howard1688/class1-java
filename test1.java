public class test1{
	public static void main(String[] args){
		int[] arr={10,24,1,7,31,954,156126,154,537299,354,2843};
		int max=0,min=1000000000,avg;
		int total=0;
		float a;
		for(int j=1;j<arr.length;j++){
			if(max<arr[j-1]){
			max=arr[j-1];
			}
			if(min>arr[j-1]){
			min=arr[j-1];
			}
		}
		for (int i=0; i<arr.length;i++){
		System.out.print(arr[i]);
		System.out.print(",");
		total=total+arr[i];
		}
		a=total;
		a=a/7;
		avg=total/7;
		System.out.println();
		System.out.printf("%d",max);
		System.out.println();
		System.out.printf("%d",min);
		System.out.println();
		System.out.printf("%d",avg);
		System.out.println();
		System.out.printf("%f",a);
		
	}
}

