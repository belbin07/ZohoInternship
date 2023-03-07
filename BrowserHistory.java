package exercise6;

import java.util.ArrayList;
import java.util.List;



public class BrowserHistory {
	
	
	 static List<String> history=new ArrayList<>();
	 static int currentIndex=-1;
	BrowserHistory(){
		history =new ArrayList<>();
		 
	}
	
	void visit(String url) throws InvalidURLException{
		
        if(url.endsWith(".com")||url.endsWith(".org")||url.endsWith(".in"))
            history.add(url);
        else
        	throw new InvalidURLException();
    }
	
	
	
	void forward(int steps) throws NoHistoryFoundException {
		if(currentIndex==-1) {
			currentIndex=history.size()-1;
		}
		
		if(currentIndex+steps>history.size()-1) {
			throw new NoHistoryFoundException();
		}
		else {
			currentIndex+=steps;
			System.out.println(history.get(currentIndex));
		}
		
		
	}
	void back(int steps) throws NoHistoryFoundException {
		
		if(currentIndex==-1) {
			currentIndex=history.size()-1;
		}
		if(steps>currentIndex) {
			
			throw new NoHistoryFoundException();
		}
		else {
			currentIndex-=steps;
			System.out.println(history.get(currentIndex));
		}
	}
	
	void get(int position) throws InvalidPositionException {
		if(position>history.size()-1) {
			
			throw new ArrayIndexOutOfBoundsException();
		}
		else if(position<0) {
			throw new InvalidPositionException();
		}
		else {
		System.out.println(history.get(position));
		}
	}
		
		
		
	
}
