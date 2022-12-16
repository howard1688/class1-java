public class test1{
	public static void main(String[] args){
		int[] arr={7,5,4,8,1,2};
		int sw;
		int j=6;
		for(int i=0;i<3;i++){
				j--;
				sw=arr[i];
				arr[i]=arr[j];
				arr[j]=sw;
		}
		for (int i=0; i<arr.length;i++){
		System.out.println(arr[i]);
		}
	
	}
}

