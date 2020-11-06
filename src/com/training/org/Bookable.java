package com.training.org;

public class Bookable {
	private String bookable;

	public String getBookable() {
		return bookable;
	}

	public void setBookable(String bookable) {
		this.bookable = bookable;
	}

	public Bookable() {
		super();
	}

	@Override
	public String toString() {
		return "Bookable [bookable=" + bookable + "]";
	}

	public Bookable(String bookable) {
		super();
		this.bookable = bookable;
	}
	

}
