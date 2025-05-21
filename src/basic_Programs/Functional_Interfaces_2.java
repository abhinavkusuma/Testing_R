package basic_Programs;

interface CabDriver{
	public String bookCab(String source, String destination);
}

//class Ola implements CabDriver{
//	public String bookCab(String source, String destination) {
//		System.out.println("Ola Cab is Booked From "+source+"To "+destination);
//		return("Price: 5000 Rs");
//	}
//}

public class Functional_Interfaces_2 {

	public static void main(String[] args) {
		CabDriver cab = (source,destination)->{System.out.println("Ola Cab is Booked From "+source+" To "+destination);
		return("Price : 5000 Rs");
		};
		System.out.println(cab.bookCab("Hyderabad", "Chennai"));
	}	
}