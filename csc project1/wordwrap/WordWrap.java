import java.util.Scanner;
public class WordWrap{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What do you want the length of each line to be");
		int lineLength = scnr.nextInt();
		System.out.println("Enter your string");
		String inputString = "";
		String lineRead;


		while(true) {
			lineRead = scnr.nextLine();
			if (lineRead.equals("stop.") || lineRead.equals("Stop.")) {
				break;
				}
				
			inputString += lineRead + " ";
			
		}
		
		inputString = inputString.substring(1);
		int totalLength = inputString.length();
		
		
		while (inputString.indexOf("  ") != -1) {
			inputString = inputString.replace("  ", " ");
	      }
		
		for (int i=0; i <= totalLength ; i= (i+lineLength)) {
			if ((i + lineLength) <= totalLength) {
				
				System.out.println(inputString.substring(i, i + lineLength));
				}
			
			else {
				System.out.println(inputString.substring(i));
			}
		}
	}
}	