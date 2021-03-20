package JavaBasicsConcepts;

public class StringMethods {
	
	public static void main(String[] args) {
		
	String str1="";
	String str="null"; 
	String name="Raman Subramani";
	String name1="Rishi";
	String lastname="Come";

		
	
	System.out.println("To Be Check Given null String is Empty or Not.........");
	
	System.out.println(str.isEmpty()); 
	
	
	
	
	System.out.println("To Be Check Given Empty String is Empty or Not.........");
	
	System.out.println(str1.isEmpty()); {
	
		
	System.out.println("To Be Check Given String is Empty or Not.........");
	
	
	if (name.isEmpty()) {
		System.out.println("Given String Is Empty:" +name);
	}
	else
	{
		System.out.println("Given String is Not Empty" +name);
	}
	
		
		System.out.println("To Be Check Given String value is contained or Not.........");
				
		System.out.println(name.contains("Subramani"));
		
		
		System.out.println("To Be Compare Given String value is Comparable or Not.........");
		System.out.println(name.compareTo(name1));
	
					
	System.out.println("To Be Replace Given String value With New Char.........");				
	System.out.println(lastname.replace('o','a'));
	
	System.out.println(name1.replaceAll(name1, "Going"));
}
}
}
