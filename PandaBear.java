class PandaBear
{
	private double 	weight; // In KILOGRAMS
	private double 	height; // In METERS
	private boolean mostlyWhite;
	private	boolean isMale;
	private String  name;

	PandaBear(double w,
			  double h,
			  boolean mw,
			  boolean im,
			  String n)
	{
		this.weight = w;
		this.height = h;
		this.mostlyWhite = mw;
		this.isMale = im;
		this.name = n;
	}

	double
	getWeight()
	{
		return weight;
	}
	
	double
	getHeight()
	{
		return height;
	}

	boolean
	isMostlyWhite(){
		return mostlyWhite;
	}

	boolean
	isMale(){
		return isMale;
	}

	String
	getName()
	{
		return name;
	}

	void
	setWeight(double newWeight) throws ImproperWeightException
	{
		if (newWeight < 0.05)
		{
			throw new ImproperWeightException("The weight can't be less than 50g!! Start feeding it");
		}

		weight = newWeight;		
	}

	void
	setHeight(double newHeight) throws ImproperHeightException
	{
		if (newHeight < 0.05)
		{
			throw new ImproperHeightException("The height can't be less than 5cm!");
		}

		height = newHeight;
	}
}






