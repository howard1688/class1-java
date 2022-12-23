//輸入輸出
javac -encoding utf-8 xxx.java
java xxx.java
//鍵盤讀取輸入的值判斷成績
import java.util.Scanner;
public class test1{
	public static void main(String[] args){
    int score;
    Scanner input= new Scanner(System.in);
    System.out.println("輸入成績");
    score = input.nextInt();
    if(score>=90){
    System.out.println("A");
    }
    else if(score<90&&score>=80){
    System.out.println("B");  
    }
    else if(score<80&&score>=70){
    System.out.println("C");  
    }
    else if(score<70&&score>=60){
    System.out.println("D");  
    }
    else{
    System.out.println("F");  
    }
  }
}
//印星星
//?
//99*法
import java.util.Scanner;
public class test1{
  public static void main(String[] args){
    int a;
    for(int x=1;x<=9;x++){
      for(int y=1;y<=9;y++){
        a=x*y;
        System.out.printf("%d",x); 
        System.out.printf("*");
        System.out.printf("%d",y);
        System.out.printf("=");
        if(a<10){
        System.out.printf("%d",a);
        System.out.print(" ");
        }
        else
        {
        System.out.printf("%d",a);
        }
        System.out.print(" ");
      }
       System.out.println(" ");
    }
  }
}
        x*y
