package Nugget4;

public class Medicine {
	private String name,address,storage;
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getStorage() {
		return storage;
	}


	public void setStorage(String storage) {
		this.storage = storage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void displayLabel(Medicine m){
		System.out.println(m.name);
		System.out.println(m.address);
	}
}
