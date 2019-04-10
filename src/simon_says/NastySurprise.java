package simon_says;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton but1 = new JButton();
	JButton but2 = new JButton();

	public static void main(String[] args) {
		new NastySurprise().start();
	}

	void start() {
		JPanel pan = new JPanel();
		JLabel lab = new JLabel();
		JFrame frame = new JFrame();
		;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 50);
		but1.setText("Trick");
		but2.setText("Treat");
		pan.add(but2);
		pan.add(but1);
		frame.add(pan);
		but1.addActionListener(this);
		but2.addActionListener(this);
		frame.pack();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressedButton = (JButton) e.getSource();
		if (but1 == pressedButton) {
			showPictureFromTheInternet(
					"https://dynaimage.cdn.cnn.com/cnn/w_768,h_1024,c_scale/https%3A%2F%2Fdynaimage.cdn.cnn.com%2Fcnn%2Fx_1229%2Cy_0%2Cw_2712%2Ch_3616%2Cc_crop%2Fhttps%253A%252F%252Fstamp.static.cnn.io%252F5b7ac48b4db3d70020c01c13%252Fshutterstock_1081879181.jpg");

		} else {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0LbRy4oHz2RSHhrq7BFnUmDZMO7aV23zLn1gfovo85YczQGcS");
		}
	}
}
