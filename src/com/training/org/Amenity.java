package com.training.org;

public class Amenity {
	private String Amenity;

	public String getAmenity() {
		return Amenity;
	}

	public void setAmenity(String amenity) {
		Amenity = amenity;
	}

	public Amenity(String amenity) {
		super();
		Amenity = amenity;
	}

	@Override
	public String toString() {
		return "Amenity [Amenity=" + Amenity + "]";
	}
	

}
