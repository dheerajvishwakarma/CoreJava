package Rivision;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;
	protected int AVG_AGE;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the aVG_AGE
	 */
	public int getAVG_AGE() {
		return AVG_AGE;
	}

	/**
	 * @param aVG_AGE the aVG_AGE to set
	 */
	public void setAVG_AGE(int AVG_AGE) {
		AVG_AGE = AVG_AGE;
	}

}
