public class test1{
	public static void main(String[] args){
		int[] arr={1,2,4,8,16,32};
		int x=10,total=0;
		setVariable(x);
		System.out.println("sv"+x);
		setArray(arr);
		for(String str:args)
			total+=Integer.parseInt(str);
		System.out.println("total"+total);
	}
	
	public static void setVariable(int x){
		x=20;
	}
	
	public static void setArray(int arr[]){
		arr[0]=20;
	}
}