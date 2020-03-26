import javax.swing.*;

public class Bubbles extends JFrame {

    public static void main(String[] args) {
        new Bubbles();
    }
    Bubbles(){
        setTitle("Hello!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
