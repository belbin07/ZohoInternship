package exercise6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidURLException, InvalidPositionException  {
		    Scanner scan=new Scanner(System.in);
		    BrowserHistory browserHistory=new BrowserHistory();
		    
		    while(true){
		    System.out.println("Enter the action to perform");
		    String action=scan.nextLine();
			if("visit".equalsIgnoreCase(action)) {
				System.out.println("Enter the url");
				String url=scan.nextLine();			
				try {
					browserHistory.visit(url);
					
				
					}
					catch(InvalidURLException invalidURLException) {
						
					}
			}
			
			else if("forward".equalsIgnoreCase(action)) {
				System.out.println("Enter the no of steps");
				int steps=scan.nextInt();			
				try {
					browserHistory.forward(steps);
					
				
					}
					catch(NoHistoryFoundException noHistoryFoundException) {
						
					}
			}
			
			else if("back".equalsIgnoreCase(action)) {
				System.out.println("Enter the no of steps");
				int steps=scan.nextInt();			
				try {
					browserHistory.back(steps);
					
				
					}
					catch(NoHistoryFoundException noHistoryFoundException) {
						
					}
			}
			else if("get".equalsIgnoreCase(action)) {
				System.out.println("Enter the position");
				int position=scan.nextInt();			
				try {
					browserHistory.get(position);
					
				
					}
					catch(InvalidPositionException invalidPositionException) {
						
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Invalid position");
				}
				
			}
			
			else if("exit".equalsIgnoreCase(action)) {
				break;
			}
			else {
				System.out.println("Enter valid action");
			}
		    }
	}
}