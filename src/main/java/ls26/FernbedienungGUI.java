import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FernbedienungGUI {

    public FernbedienungGUI() {
        this.init();
    }

    private void init() {
        JFrame frame = new JFrame("Fernbedienung");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JButton("Power"));
        panel.add(new JButton("Garage"));
        panel.add(new JButton("Stereo"));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("Licht"));
        panel.add(new JButton(" ↩ "));

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.pack();
        frame.setVisible(true);
    }
}
