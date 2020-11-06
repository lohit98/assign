package com.training.org;

import java.time.LocalTime;
import java.util.ArrayList;

public class Vendor extends User {
	private String name;
	private String description;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private ArrayList<File> images;
	private ArrayList<Bookable> offers;
	private ArrayList<Amenity> amenities;
	
	public Vendor(String email, String padssword, String phoneNumber, Address adress, boolean verified,
			ArrayList<Role> roles, boolean enabled, String name, String description, LocalTime openingTime,
			LocalTime closingTime, ArrayList<File> images, ArrayList<Bookable> offers, ArrayList<Amenity> amenities) {
		super(email, padssword, phoneNumber, adress, verified, roles, enabled);
		this.name = name;
		this.description = description;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.images = images;
		this.offers = offers;
		this.amenities = amenities;
	}
	

}
