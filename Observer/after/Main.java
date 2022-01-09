public class Main {
	public static void main(String arg[]) {
		Model model = new Model();
		ControllerFrame controllerFrame = new ControllerFrame(model);
		ViewFrame viewFrame = new ViewFrame(model);

		controllerFrame.setVisible(true);
		viewFrame.setVisible(true);

		new ViewFrame(model).setVisible(true);
		new ViewFrame(model).setVisible(true);

		new ViewControllerFrame(model).setVisible(true);
		new SliderFrame(model).setVisible(true);
		new ProgressBarFrame(model).setVisible(true);
	}
}