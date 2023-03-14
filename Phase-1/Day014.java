public class Day014{
	
	{// runs at time of instance creation
		System.out.println("In init block...");
	}
	
	static{ // runs at the time of class loading
		System.out.println("In static block...");
	}
	
	public Day014(){
		System.out.println("In constructor...");
	}
	
	// static, init and constructor hierarchy //
	public static void main(String args){
		Day014 obj1 = new Day014();
		Day014 obj2 = new Day014();
	}
	
}