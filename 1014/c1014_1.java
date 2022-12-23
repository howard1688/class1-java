import java.util.Scanner;
public class c1014_1{
	public static void main(String[] args){
		int iii=4;
		String space = "*";
		while(iii>=0){
			System.out.printf("%s",space);
			iii--;
			space=space+"*";
			System.out.println();
        }
	}
}
