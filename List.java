package Exercise_1;



public class List {
	
	private String [] arr;
    static int sizeOfArray;
    int incriment=5;
	List() {
		sizeOfArray=5;
		arr=new String[sizeOfArray];
	}
	
	public void add(String data) {
		while(arr[sizeOfArray-1]!=null) {
			String []temperory=arr;
			incrimentingSize();
			for(int index=0;index<sizeOfArray-incriment;index++) {
				arr[index]=temperory[index];
			}
		}
		
		    for(int index=0;index<sizeOfArray;index++) {
				if(arr[index]==null) {
					arr[index]=data;
					return;
				}
			}
		
	}
	
	void incrimentingSize() {
		sizeOfArray+=incriment;
		arr=new String[sizeOfArray];
		return;
		
		
	}
	
	public void remove(int indexNo) {
		
		for(int index=indexNo;index<sizeOfArray-1;index++){
			arr[index]=arr[index+1];
			
		}
		arr[sizeOfArray-1]=null;
		
	}
	
	public void update(int indexNo,String data) {
		
		arr[indexNo]=data;
		
	}
	
	void show() {
		for(int i=0;i<sizeOfArray;i++) {
		System.out.println(arr[i]);
		}
		
	
}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List l=new List();
		
		l.add("rtyu");
		l.add("rtyukko");
		l.add("ro");
		l.add("r1");
		l.add("r2");
		l.add("r3");
		l.add("r4");
		l.add("ro5");
		l.add("r6");
		l.add("r7");
		l.add("r8");
		l.add("r9");
		
		l.update(2,"ertyuio");
		l.remove(3);
		l.show();
		
		
	
		
		
	}

}
