import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class DigitalClock extends JFrame {
    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(timeLabel);

        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            timeLabel.setText(sdf.format(new Date()));
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DigitalClock().setVisible(true));
    }
}