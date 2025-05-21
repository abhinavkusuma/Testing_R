package basic_Programs;

@FunctionalInterface
interface Cab{
	public void bookCab();
}

//class Ola implements Cab{
//	public void bookCab() {
//		System.out.println("Ola Cab is Booked...");
//	}
//	()->System.out.println("Ola cab is Booked");
//}

public class Functional_Interfaces_1 {

	public static void main(String[] args) {
		Cab cab = ()->System.out.println("Ola cab is Booked");
		cab.bookCab();
	}
}