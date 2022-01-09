class Model
{
	private int data;

	public int getData() { return data ; }
	public void setData(int d)
	{
		data = d ;
		System.out.println(data);

		frame.update();
	}


	// this couples the Model class to a specific GUI class
	// it is not desired

	public void setViewFrame(ViewFrame frame)
	{
		this.frame = frame ;
	}

	private ViewFrame frame;


}