import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window {
    /**
     * UID
     */
    private static final long serialVersionUID = 4555917589254575357L;
    /**
     * Initialize Objects/Variables which are
     * components of the Application
     *
     */
    private JFrame objFrame;
    private JButton btnClick;

    /**
     * Constructor
     * Code segment to initialize Layout/Window of Application
     */
    Window(){
        /**
         * Set title of Window via JFrame
         */
        objFrame = new JFrame("Java GUI");

        /**
         * Creating a button
         */
        btnClick = new JButton("Click Me!");

        objFrame.setSize(500,300);
        /**
         * Set up layout of GUI
         */
        objFrame.setLayout(new FlowLayout());

        /**
         * Append, add button to Window/JFrame
         */
        objFrame.getContentPane().add(btnClick);

        /**
         * Close Window/Terminate Program
         */
        objFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        /**
         * Make sure that window is shown
         */
        objFrame.setVisible(true);



    }

    public static void main(String[] args) {
        Window w = new Window();

    }
}
