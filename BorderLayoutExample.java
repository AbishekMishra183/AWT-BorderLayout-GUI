/*
Write a program using AWT to create a GUI that implements a frame
with Border layout. The GUI should have two different sections. A left
panel and a right panel. On the left panel add a button, on the right
panel add a label with the text "I am hungry “ When a button is pressed
update that label on the right to display “lets eat rice”.
 */


import java.awt.*;
import java.awt.event.*;





    public class BorderLayoutExample extends Frame {
        private Label rightLabel;

        public BorderLayoutExample() {
// Set up the frame
            setTitle("BorderLayout Example ");
            setSize(400, 200);
            setLayout(new BorderLayout());
// Create left panel with a button
            Panel leftPanel = new Panel();
            leftPanel.setLayout(new FlowLayout());
            Button button = new Button("Press Me");
            leftPanel.add(button);
// Create right panel with a label
            Panel rightPanel = new Panel();
            rightPanel.setLayout(new FlowLayout());
            rightLabel = new Label("I am hungry");
            rightPanel.add(rightLabel);

// Add panels to the frame
            add(leftPanel, BorderLayout.WEST);
            add(rightPanel, BorderLayout.EAST);
// Add action listener to the button
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    rightLabel.setText("Lets eat rice");
                }
            });
// Add window listener to handle window closing
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }
        public static void main(String[] args) {
            BorderLayoutExample frame = new BorderLayoutExample();
            frame.setVisible(true);
        }
    }

