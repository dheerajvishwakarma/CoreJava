package CollectionFramework;

import java.util.Comparator;

public class MarksheetComparator implements Comparator<Marksheet> {
	private String rollNo;
	private String firstName;
	private String lastName;
	private int Physics;
	private int Chemestry;
	private int Maths;

	public MarksheetComparator() {
	}

	/**
	 * @return the rollNo
	 */
	public String getRollNo() {
		return rollNo;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the physics
	 */
	public int getPhysics() {
		return Physics;
	}

	/**
	 * @return the chemestry
	 */
	public int getChemestry() {
		return Chemestry;
	}

	/**
	 * @return the maths
	 */
	public int getMaths() {
		return Maths;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param physics the physics to set
	 */
	public void setPhysics(int physics) {
		Physics = physics;
	}

	/**
	 * @param chemestry the chemestry to set
	 */
	public void setChemestry(int chemestry) {
		Chemestry = chemestry;
	}

	/**
	 * @param maths the maths to set
	 */
	public void setMaths(int maths) {
		Maths = maths;
	}

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());

	}

}
