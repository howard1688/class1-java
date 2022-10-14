import java.util.Scanner;
public class a1{
	public static void main(String[] args){
        int ii=4;
        String space = "     ";
		String spacee = "*";
        while(ii>=0){
			System.out.printf("%s",space);
			System.out.printf("%s",spacee);
			System.out.println();
            space = space.substring(0, space.length()-1);
			spacee=spacee+"**";
			ii--;
        }
    }
}