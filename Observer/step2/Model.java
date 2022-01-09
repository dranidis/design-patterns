class Model extends Viewable
{
	private int data;

	public int getData() { return data ; }
	public void setData(int d)
	{
		data = d ;
		System.out.println(data);

		//provided by Viewable
		notifyViewer();

	}




}