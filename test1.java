public class test1{
	public static void main(String[] args){
		int a;
		int k;
		//System.out.printf("%d",k);
		//test2 t2=new test2();
		//a=t2.add(k,4);
		//System.out.printf("%d",a);
		for(int i=0;i<=9;i++){
			{
				//System.out.print("*");
				for(int j=-5+i;j<=5;j++){
					
					if(j<=i&&j>=0){
					System.out.print(" ");
					}
					
					else
					{
					System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
	
	}

class test2{
	public static int add(int x,int y){
		int t=x+y;
		return t;
	}
}
