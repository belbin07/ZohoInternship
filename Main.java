package exercise2;

import java.util.ArrayList;
import java.util.List;

class Browser{
	Browser(){
		
	}
	
	void whoAmI() {
		
		System.out.println("I am a browser");
	}
	
	
}

interface MultipleAccountContainers{
	
	void addContainer(String container);
	void leaveContainer(String container);
	void viewAllContainers();
}

class GoogleChrome extends Browser{
	
	GoogleChrome(){
		super();
	}
	
	boolean isLocationAccessible;
	boolean isCameraAccessible;
	boolean isMicrophoneAccessible;
	final String versionNumber="1.0";
	
	void setPermissions(String variable,boolean individualPermission) {
		
		if(variable=="Location"&&individualPermission==true) {
			System.out.println("Location access  allowed");
		}
		else if(variable=="Location"&&individualPermission==false){
			System.out.println("Location access  denied");
		}
		
		else if(variable=="Camera"&&individualPermission==true) {
			System.out.println("Camera access  allowed");
		}
		else if(variable=="Camera"&&individualPermission==false) {
			System.out.println("Camera access  denied");
		}
		
		else if(variable=="Microphone"&&individualPermission==true) {
			System.out.println("Mic access  allowed");
		}
		
		else if(variable=="Microphone"&&individualPermission==false) {
			System.out.println("Mic access  denied");
		}
		else {
			System.out.println("Enter valid input");
		}
		
		
	}
	
	void setPermissions(boolean isLocationAccessible,boolean isCameraAccessible,boolean isMicrophoneAccessible) {
		
		if(isLocationAccessible==true) {
			System.out.print("Location access allowed, ");
		}
		else if(isLocationAccessible==false) {
			System.out.print("Location access denied, ");
		}
		if(isCameraAccessible==true) {
			System.out.print("Camera access allowed, ");
		}
		else {
			System.out.print("Camera access denied, ");
		}
		if(isMicrophoneAccessible==true)	{
			System.out.println("Mic access allowed ");
		}
		else {
			System.out.println("Mic access denied ");
		}
	}
		
		
		
	
	
	void whoAmI() {
		
		System.out.println("I am Google Chrome");
	}
	
	
}

class Firefox extends Browser implements MultipleAccountContainers{
	
	List<String> container = new ArrayList<> ();
	Firefox(){
		super();
		container=new ArrayList<String>();
	}
	void whoAmI() {
		
		System.out.println("I am Firefox");
	}

	
	@Override
	public void addContainer(String container) {
		
		this.container.add(container);
		
		
		
	}
	@Override
	public void leaveContainer(String container) {
		
		this.container.remove(container);
		
	}
	
	public void viewAllContainers() {
		System.out.println(container);
		
	}
	
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleChrome chrome=new GoogleChrome();
		Browser firefox=new Firefox();
		Browser tabOne= new GoogleChrome();
		Browser tabTwo= new Firefox();
		Browser tabThree= new Firefox();
		Browser tabFour= new GoogleChrome();
		Browser tabFive= new GoogleChrome();
		Browser browser= new Firefox();
		Browser[] allBrowsers = {chrome,firefox,browser,tabOne,tabTwo,tabThree,tabFour,tabFive};
		
		chrome.whoAmI();
		firefox.whoAmI();
		chrome.setPermissions("Camera",false);
		chrome.setPermissions(true,false,true);
		
		System.out.println("The version of Chrome is :"+chrome.versionNumber);
		
		int noOfChromeTabs=0;
		for(int index=0;index<8;index++) {
			if(allBrowsers[index] instanceof GoogleChrome) {
				noOfChromeTabs+=1;
			}
		}
		
		System.out.println("Number of Google Chrome tab opened are :"+noOfChromeTabs);
		
		((MultipleAccountContainers) browser).addContainer("facebookContainer"); 
		((MultipleAccountContainers) browser).addContainer("Mails"); 
		((MultipleAccountContainers) browser).addContainer("PrivateBrowsing");     
		((MultipleAccountContainers) browser).viewAllContainers(); //List 3 container names
		((MultipleAccountContainers) browser).leaveContainer("PrivateBrowsing"); //delete given container
		((MultipleAccountContainers) browser).viewAllContainers(); 
		
		
		
		
		

	}



}
