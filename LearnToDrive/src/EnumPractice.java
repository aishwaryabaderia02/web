import com.learn2drive.util.FuelType;


public class EnumPractice {

	public static void main(String[] args) {
		
		String[] csv = {"MH-31-3656,124578.00,Dominar,Natural_gas","MH-49-6768,36568.00,Activa,Petrol",
	            	"MH-20-5676,376895,BMW-GS,Diesel"};
	
		Vehical[] obj = new Vehical[3];
		//Vehical obj = new Vehical();
		obj = readCSV(csv);
		for(int i = 0 ; i< 3 ; i++)
		{
		System.out.println(obj[i].getName() + " " + obj[i].getPrice() + " " + obj[i].getRegistrationNumber()+ " " + obj[i].getFuelType());
		}
	}
		/*for(int i = 0;i < 3 ; i++)
		{
			//s = csv[i].split(",");
			Vehical[] array = new Vehical[3]; 
			array = readCSV(csv);
		}
		
		
	}
	public static Vehical[] readCSV(String[] data)
	{
		
		String[] s;
		Vehical[] obj = new Vehical[3];
		for(int j = 0;j < 3 ; j++)
		{
			s = data[j].split(",");
			
				obj[j] = new Vehical();
				obj[j].setRegistrationNumber(s[0]);
				obj[j].setPrice(Double.parseDouble(s[1]));
				obj[j].setName(s[2]);
				obj[j].setFuelType(FuelType.valueOf(s[3].toUpperCase()));
		}
		return obj;
	}
	
	*/
	public static Vehical[] readCSV(String[] data)
	{
		Vehical[] obj = new Vehical[3];
		for(int i = 0; i < 3; i++)
		{
			String[] s = data[i].split(",");
			
			
			for(int j = 0; j < 3; j++)
			{
				obj[j] = new Vehical();
				obj[j].setRegistrationNumber(s[0]);
				obj[j].setPrice(Double.parseDouble(s[1]));
				obj[j].setName(s[2]);
				obj[j].setFuelType(FuelType.valueOf(s[3].toUpperCase()));
			}
		}
		return obj;
	}
}