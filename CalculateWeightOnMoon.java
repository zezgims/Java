
/* The moon’s gravity is about 17 percent that of earth’s. Code that calculate your effective weight per month. */

public class Chapter1SelfTest {

	public static void main(String[] args) {
    
		double earth_gravity = 9,807;
		double moon_gravity = (earth_gravity*17) / 100;
		double earth_weight = 59.55;
		double moon_weight = (moon_gravity*earth_weight)/earth_gravity;
		
		System.out.println("If the earth's gravity is " + earth_gravity +
						   " the moon's gravity is " + moon_gravity);
		System.out.println("The weight of a person is " + earth_weight + 
						   " in the world, is " + moon_weight + 
						   " in the moon");
		
	}

}
