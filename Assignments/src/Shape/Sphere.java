package Shape;

public class Sphere extends ShapeDemo{
	
	@Override
	public float shapeManager(int r)
	{
		return 3.14f * r * r;
	}
}
