import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class BasketBall {

	private int width = 600;
	private int height = 600;
	private int y = 30;
	private int x = width/2;
	private int v=0;
	private int r=30;
	
	public static void main(String[] args) {
		
		final BasketBall b = new BasketBall();
		JPanel panel = new JPanel() {
			
			@Override
			public void paintComponent(Graphics g) {
				g.setColor(Color.RED);				
				g.fillOval(b.x-b.r, b.y-b.r, 2*b.r, 2*b.r);
			}
			
		};
		
		
		JFrame frame = new JFrame();
		frame.setContentPane(panel);
		panel.setSize(b.width, b.height);
		frame.setBackground(Color.GREEN);
		
		frame.setSize(650, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		while (true) {
			b.simulate();
			panel.repaint();
			frame.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void simulate() {
		
		y = y +v+1;
		v = v +1;
		if (y >= height-18) {
			y = height-18;
			v = -v+1;
		}
		
		
	}
	
	
}














