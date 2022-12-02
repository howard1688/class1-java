public class carr{
	public static void main(String[] args){
		Car[] myCar=new Car[9];
		for(int i=0;i<6;i++){
			
			myCar[i]=new Car();
			int x=myCar[i].launch(i);
			System.out.println(x);
			}
	}
}
/*xx=nwe xxx-動態產生
System.out.print();-靜態(開頭為大寫)(具有唯一性 不需要new)
Math.abs(); 類別.方法 直接呼叫*/
