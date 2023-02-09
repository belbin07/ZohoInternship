package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 class Browser {
	
	private static List<String> history;

	public Browser() {
		history = new ArrayList<String>();
		}
		
//	Browser(String[] url){
//		setHistory(url);
//	}

	void setHistory(String url) {
		
		 history.add(url);
			
		}
		
	void showHistory() {
		for(String url : history) {
			System.out.println(url);
		}
	}
}
	
class Main {
	
	public static void main(String[] args) {
		
		
		Browser chrome = new Browser();
		int n;
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of inputs:");
		n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter url:");
			input = scan.nextLine();
			chrome.setHistory(input);
		}
		
		System.out.println("\tShowing history");
		chrome.showHistory();
		
		scan.close();

	

	}

}
