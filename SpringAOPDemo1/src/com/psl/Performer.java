package com.psl;

import org.springframework.stereotype.Component;

@Component(value="perform")
public class Performer {
	public void performerHaveLunch() {
		System.out.println("Have Lunch");
	}

	public void perform() throws Exception {
		System.out.println("Give Performanece");
		throw new Exception("Rain Rain Go Away");
	}

	public void giveAutographs() {
		System.out.println("zoom");
	}

	public void takeFlightToHome() {
		System.out.println("Gaya ghar");
	}
}
