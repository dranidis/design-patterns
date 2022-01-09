public class Viewable {
	// The Viewable depends on an interface (ModelViewer)

	public void setViewFrame(ModelViewer frame)
	{
		this.frame = frame ;
	}

	public void notifyViewer()
	{
		frame.update();
	}


	private ModelViewer frame;
}