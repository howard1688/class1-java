public class pai{
	public static void main(String[] args){
		int[] a={2,2,8,9,2,2};
		int aa,cout=0;
		for(int i=0;i<a.length;i++){
				for(int j=1;j<a.length;j++){
					if(a[j-1]>a[j]){
						aa=a[j];
						a[j]=a[j-1];
						a[j-1]=aa;
					}
				System.out.println(cout+=1);
				}	
		}
		for(int j=0;j<a.length;j++){
			System.out.println(">>"+a[j]);
		}
		
	}
}

