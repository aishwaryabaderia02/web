import com.persistent.esg.itp.shape.*;
public class Client {
	
	
	public static void main(String[] args) {
		
		Square s=new Square(4);
		Rectangle r=new Rectangle(10,20);
		s.calcArea();
		s.calcPeri();
		r.calcArea();
		r.calcPeri();
		s.display();
		r.display();
	}
}
