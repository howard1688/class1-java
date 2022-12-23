import java.util.Scanner;
public class c2{
	public static void main(String[] args){
        int n1 ;
        int n2 ;
        int grade;
        double qu;
        Scanner input= new Scanner(System.in);
        System.out.println("輸入成績1");
        grade= input.nextInt();
        switch(grade/10)
        {
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
            default:
                System.out.println('E');
                break;
        
        }
    }
}
