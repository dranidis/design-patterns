import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Client {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                FontDialogDirector fontDialog = new FontDialogDirector(frame);

                String font = fontDialog.getFontFromDialog();

                System.out.println("\nSelected font: " + font);

            }
        });
    }

}
