package Nugget4;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] med = new Medicine[10];
		int i = (int)(Math.random() * 2 +1);
		Medicine m = null;
		if(i == 0)
		{
			m = new Syrup();
			m.setStorage("use only under doctors supervision");
			
		}
		else if(i == 1)
		{
			m = new Ointment();
			m.setStorage("for external use only");
		}
		else
		{
			m = new Tablet();
			m.setStorage("Store in cool and dry place");
		}
	}
}
