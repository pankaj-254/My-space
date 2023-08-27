package J_Static_Final_keyword;

//singleTon class
class CoffeeMachine
{
	private float coffeeQty;
	private float milkQty;
	
//counter for object so that we can restrict the now of Object to be created 
	private static int countObj=1;
	
	static private CoffeeMachine our=null;
	private CoffeeMachine() 
	{
		coffeeQty=1;
		milkQty=1;
	}
	
	public static CoffeeMachine getCMInstance()
	{   if(our==null || countObj<=5) {	
		our = new CoffeeMachine(); 
		countObj++;
		}
			return our;
	}
	
	
//	public String toString() {
//		return "Now you can get your coffee";
//	}
}

public class SingleTon_Class {
//SingleTon class : A class which can create only one object so how we can ristrict the clas to create only one object by making the constructor as private and creating the object within the class inside some public method i.e getInstance() and create the object there and accessing it by calling getInstance() 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoffeeMachine c1=CoffeeMachine.getCMInstance();				
		CoffeeMachine c2=CoffeeMachine.getCMInstance();				
		CoffeeMachine c3=CoffeeMachine.getCMInstance();	
		CoffeeMachine c4=CoffeeMachine.getCMInstance();				
		CoffeeMachine c5=CoffeeMachine.getCMInstance();				
		CoffeeMachine c6=CoffeeMachine.getCMInstance();	
		System.out.println(c1);		
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);		
		System.out.println(c5);
		System.out.println(c6);
		System.out.println("here Address of all the 3 object reference are same so they all are only one object with different reference \n");
		
//Now we are checking weather all the object are create are same or not 
		if(c1==c2 && c2==c3 && c3==c4 && c4==c5 && c5==c6)
		{
		
			System.out.println("all the objects are same that is here we have only one Object and its example of :SingleTon Class");
		}
		else {
			System.out.println("as c1!=c2 && c2!=c3 && c3!=c4 && c4!=c5 && c5!=c6 therefore all object are differnet");
		}
		
	}

}
