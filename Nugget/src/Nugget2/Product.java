package Nugget2;

public class Product {
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String pName;
	public String keyword;
	
	public static boolean isPresent(String[] PName, String keyword)
	{
		Product p = new Product();
		p.setKeyword(keyword);
		for(int i = 0; i < 3 ; i++)
		{
				
		}
		return false;
	}
	
	static String[] initProductNames()
	{
		Product[] obj = new Product[3];
		for(int i = 0; i < 3 ; i++)
		{
			obj[i] = new Product();
		}
		obj[0].pName = "Soap";
		obj[0].keyword = "So";
		
		obj[1].pName = "Brush";
		obj[1].keyword = "Br";
		
		obj[2].pName = "Comb";
		obj[2].keyword = "Co";
			
		String[] s = new String[6];
		s[0] = obj[0].pName;
		s[1] = obj[0].keyword;
		s[2] = obj[1].pName;
		s[3] = obj[1].keyword;
		s[4] = obj[2].pName;
		s[5] = obj[2].keyword;
		
		return s;
	}
	
}
