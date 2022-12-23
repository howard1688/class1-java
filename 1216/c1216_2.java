public class test1{
	public static void main(String[] args){
		int[] arr={7,5,4,9,8,1,2};
		int sw;
		int total=0;
		float a;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
			if(arr[j-1]>arr[j]){
				sw=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=sw;
			}
			}
		}
		for (int i=0; i<arr.length;i++){
		System.out.print(arr[i]);
		total=total+arr[i];
		}
		a=total;
		a=a/7;
		System.out.println();
		System.out.println(arr[6]);
		System.out.println(arr[0]);
		System.out.printf("%f",a);
		System.out.println(arr[3]);
		
	}
}

