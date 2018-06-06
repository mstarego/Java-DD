import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class GameBoard extends JPanel implements MouseListener {
private static final int WIDTH = 600;
private static final int HEIGHT = 600;
private static JFrame frame;
private Timer t;
private ArrayList<Space> spaces = new ArrayList<Space>();
	public GameBoard() {
		
		for(int x = 0; x < 1000; x += 25) {
			for(int y = 0; y < 1000; y += 25) {
				spaces.add(new Space(x, y, 25, 25));
			}
		}
//		System.out.println(spaces);
		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

	}
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setBackground(Color.BLACK);
		for(Space space : spaces) {
			g2d.setPaint(Color.GREEN);
			g2d.fill(space);
			g2d.setPaint(Color.BLACK);
			g2d.draw(space);
		}
		}
	public static void main (String[] args) {
		frame = new JFrame("Dungeons and Dragons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.black);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(true);
		frame.add(new GameBoard());
		frame.setVisible(true);
	}




	
}
