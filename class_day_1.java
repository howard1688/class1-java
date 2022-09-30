import java.util.Scanner;
public class class_day_1{
	public static void main(String[] args){
        int n1 ;
        int n2 ;
        int sum;
        double qu;
        Scanner input= new Scanner(System.in);
        System.out.println("輸入成績1");
        n1 = input.nextInt();
        
        System.out.println("輸入成績2");
        n2 = input.nextInt();
        sum=(n1+n2)/2;
        if(sum>=90){
            System.out.println("超棒");
            System.out.println("平均為" +sum);
        }
        else if(sum>=60){
            System.out.println("lol");
            System.out.println("平均為" +sum);
        }
        else{
            System.out.println("trash");
            System.out.println("平均為" +sum);
        }
	}
}