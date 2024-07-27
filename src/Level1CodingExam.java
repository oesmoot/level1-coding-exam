import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton yellow = new JButton();
JButton red = new JButton();
JButton blue = new JButton();
JButton green = new JButton();

public void start(){
	frame.add(panel);
	panel.add(yellow);
	panel.add(red);
	panel.add(blue);
	panel.add(green);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	yellow.setOpaque(true);
	yellow.setBackground(Color.yellow);
	red.setOpaque(true);
	red.setBackground(Color.red);
	blue.setOpaque(true);
	blue.setBackground(Color.blue);
	green.setOpaque(true);
	green.setBackground(Color.green);
	green.addActionListener(this);
	yellow.addActionListener(this);
	red.addActionListener(this);
	blue.addActionListener(this);
}
public static void main(String[] args) {
	Level1CodingExam exam = new Level1CodingExam();
	exam.start();
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say -v Bruce " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed == yellow) {
		speak("yellow");
	}
	if(buttonPressed == red) {
		speak("red");
	}
	if(buttonPressed == blue) {
		speak("blue");
	}
	if(buttonPressed == green) {
		speak("green");
	}
}
}
