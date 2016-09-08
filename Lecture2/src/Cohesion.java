/**
 * 
 */

/**
 * @author nasro
 *
 */
class Address {
	private int streetNumber = 0;
	private String street = "";
	private String appart = "";
	private String city = "";
	private String zipCode = "";

	public Address(int streetNumber, String street, String appart, String city, String zipCode) {
		this.streetNumber = streetNumber;
		this.street = street;
		this.appart = appart;
		this.city = city;
		this.zipCode = zipCode;
	}
}

class Student {
	private String id = "";
	private String firstName = "";
	private String lastName = "";
	private Address address;;

	public Student() {
		this.id = "";
	}
}

public class Cohesion {

}
