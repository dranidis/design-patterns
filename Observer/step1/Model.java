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


	// The model now depends on an interface (ModelViewer)
	// and is not coupled to the specific class ViewFrame (which implements the interface)

	public void setViewFrame(ModelViewer frame)
	{
		this.frame = frame ;
	}

	private ModelViewer frame;


}