class PandaWorld
{
	public static void main(String[] args)
	{
		PandaBear panda = new PandaBear(100,
										1,
										true,
										false,
										"Bruce Lee");
	
		try
		{
			panda.setWeight(-10);
		}
		catch (ImproperWeightException e)
		{
			e.printStackTrace();
		}
	}
}
