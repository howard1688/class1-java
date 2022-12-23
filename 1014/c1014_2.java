import java.util.Scanner;
public class c1014{
	public static void main(String[] args){
        int ii=4;
		int iii=5;
		String space = "";
		String spacee = "****";
		while(iii>=0){
			System.out.printf("%s",space);
			iii--;
			space=space+"*";
			System.out.println();
        }
		while(ii>=0){
            System.out.printf("%s",spacee);
            iii--;
			spacee = spacee.substring(0, spacee.length()-1);
			System.out.println();
        }
		
    }
}
