import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args ){
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choose whether to 's'huffle, 'd'raw, show 'a'll, or 'q'uit");
			String choice = scanner.nextLine();
			if(choice.equals("s")){
			} else if (choice.equals("d")) {
			} else if(choice.equals("a")){
			} else if (choice.equals("q")){
				scanner.close();
				System.exit(1);//ends program
			}
			System.out.println();
		}
    }
}
