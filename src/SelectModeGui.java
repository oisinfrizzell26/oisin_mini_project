

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



public class SelectModeGui implements ActionListener {
    private JButton button; //adds buttons
    private JButton button2;
    private JButton button3;
    private JFrame frame;
    private Quiz quiz; //if button one is clicked it starts Quiz()


    public void setupGUI() {
        Border border = BorderFactory.createLineBorder(Color.black, 10); //creates border

        button = new JButton(); //creates buttons
        button.setBounds(400, 360, 200, 50); //x,y,width,height
        button.addActionListener(this);
        button.setText("1"); //what it displays



        JLabel label = new JLabel(); //creates new label
        label.setText("<html>Welcome to Oisin's and Ruan's game.<br>Click 1 to play Oisin's Game");
        label.setHorizontalTextPosition(JLabel.CENTER); //centers text
        label.setFont(new Font("MV Boli", Font.PLAIN, 40)); //font , if its bold or not , font size
        label.setVerticalTextPosition(JLabel.TOP); //sets vertical position
        label.setForeground(Color.black); //color of text
        label.setBorder(border); //makes border
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 1500, 1000); //

        frame = new JFrame();
        frame.setTitle("Oisin's and Ruan's quiz game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes it exit when you click close
        frame.setSize(1500, 1000); //sets size
        frame.setLayout(null); //makes it so i can arange where i want things
        frame.setVisible(true); //makes it visble
        frame.add(label);
        frame.getContentPane().setBackground(Color.orange); //sets background to orange
        frame.add(button); //adds new buttons to the frame

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.setVisible(false);
            quiz = new Quiz();
        }
    }
}
