public class Main {
	public static void main(String arg[]) {
		Model model = new Model();
		ControllerFrame controllerFrame = new ControllerFrame(model);
		ViewFrame viewFrame = new ViewFrame(model);

		controllerFrame.setVisible(true);
		viewFrame.setVisible(true);
	}
}