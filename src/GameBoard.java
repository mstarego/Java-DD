import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class GameBoard extends JPanel{
private static final int WIDTH = 615;
private static final int HEIGHT = 615;
public static JFrame frame;
private Timer t;
private Player p1;
private Die d6;
private Die d25;
public Monster m;
private Point2D point;

public static ArrayList<Space> spaces = new ArrayList<Space>();
	public GameBoard() {
		t = new Timer(25, null);
		d25 = new Die(25);
		d6 = new Die(6);
		for(int x = 0; x < 600; x += 25) {
			for(int y = 0; y < 575; y += 25) {
				spaces.add(new Space(x, y, 25, 25));
			}
		}
		p1 = new Player(Player.Race.DWARF, Player.Class.BARBARIAN);
		 
//		System.out.println(spaces);
		addMouseListener(new MouseListener() {
			


			@Override
			public void mouseClicked(MouseEvent arg0) {}
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			@Override
			public void mouseExited(MouseEvent arg0) {}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("(" + p1.getXPos() + ", " + p1.getYPos() + ")");
				for(Space space : spaces) {
					//only able to move to adjacent squares
					if(Math.abs(e.getX() - p1.getXPos()) < p1.getSpeed() + 12.5 && Math.abs(e.getY() - p1.getYPos() ) < p1.getSpeed() + 12.5){
					if(space.contains(new Point2D.Double(e.getX(), e.getY()))) {
						p1.setXPos(space.getXCenter());
						p1.setYPos(space.getYCenter());
						if(space.undiscovered) {
							if(d6.roll() == 1) {
								System.out.println("A monster spotted you");
								m = new Monster(p1.getXPos(), p1.getYPos());
								do {
									p1.battle(m);
									m.battle(p1);
								}while(p1.battleInProgress);
							}
						}
						
					}
					}
				}
				
				repaint();
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {}


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
		g2d.setPaint(Color.BLACK);
		g2d.fillRect((int)(p1.getXPos() - 5), (int)(p1.getYPos() - 5), 10, 10);

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
