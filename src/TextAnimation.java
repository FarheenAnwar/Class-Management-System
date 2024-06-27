// import javax.swing.*;

// import org.w3c.dom.events.MouseEvent;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.net.URI;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;
// import java.net.URI;

// public class TextAnimation extends JPanel implements ActionListener {
//     private int xPos = 0; // Initial position of the text
//     private String text = "<html><a href=''>Click here to visit OpenAI</a></html>";
//     private Timer timer;

//     public TextAnimation() {
//         // Set up the timer to call actionPerformed every 30 milliseconds
//         timer = new Timer(30, this);
//         timer.start();
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // Clear the panel
//         g.clearRect(0, 0, getWidth(), getHeight());
//         // Draw the text at the current position
//         g.drawString(text, xPos, getHeight() / 2);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // Update the position of the text
//         xPos += 5;
//         if (xPos > getWidth()) {
//             xPos = 0; // Reset position to the left of the panel
//         }
//         // Request a repaint to update the animation
//         repaint();
//     }

// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class TextAnimation extends JPanel implements ActionListener {
    private int xPos = 0; // Initial position of the text
    private String text = "Click here to visit OpenAI";
    private Timer timer;
    private JLabel linkLabel;

    public TextAnimation() {
        // Set up the timer to call actionPerformed every 30 milliseconds
        timer = new Timer(80, this);
        timer.start();

        // Create a JLabel to render the HTML text
        linkLabel = new JLabel(text);
        linkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkLabel.setForeground(Color.BLUE);

        // Add a mouse listener to handle clicks on the JLabel
        linkLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.openai.com"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Clear the panel
            g.clearRect(0, 0, getWidth(), getHeight());
            // Draw the text at the current position
            g.drawString(text, xPos, getHeight() / 2);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // Update the position of the text
            xPos += 5;
            if (xPos > getWidth()) {
                xPos = 0; // Reset position to the left of the panel
            }
            // Request a repaint to update the animation
            repaint();
        }
    
    }