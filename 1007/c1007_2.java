import java.util.Scanner;
public class c21{
	public static void main(String[] args){
        int grade;
        Scanner input= new Scanner(System.in);
        System.out.println("輸入成績1");
        grade= input.nextInt();
        if(grade>=101|grade<0){
            System.out.println("不要亂打北七");
        }
        else{
            switch(grade/10)
                {   
                case 10:
                case 9:
                    System.out.println('A');
                    break;
                case 8:
                    System.out.println('B');
                    break;
                case 7:
                    System.out.println('C');
                    break;
                case 6:
                    System.out.println('D');
                    break;
                case 5,4,3,2,1,0:
                    System.out.println('E');
                    break;
                default:
                    System.out.println("不要亂打北七");
                    break;
        
            }
        }
    }
}
