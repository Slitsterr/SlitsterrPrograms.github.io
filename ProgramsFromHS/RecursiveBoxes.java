//RecursiveBoxes
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
public class RecursiveBoxes extends JPanel{
	public RecursiveBoxes(){
		setSize(640,480);
		setBackground(Color.WHITE);
		setVisible(true);
	}
	public void paintComponent( Graphics window ){
		super.paintComponent(window);
		window.setColor(Color.ORANGE);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Drawing Boxes Using Recursion ",20,80);
		drawBoxes(window,100,100);
	}
	public void drawBoxes(Graphics window, int x, int y){
		//base case
			window.setColor(Color.BLUE);
			window.drawRect(90+x, 90+y, 20+x, 20+x);
			//drawBoxes(window, x+10, y+10);
			if(x>3) drawBoxes(window, x-20,y-20);
			else return;
	}
}
//GraphicsRunner
import javax.swing.JFrame;
public class GraphicsRunner extends JFrame{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	public GraphicsRunner(){
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
		getContentPane().add(new RecursiveBoxes());
		setVisible(true);
	}
	public static void main( String args[] )	{
		GraphicsRunner run = new GraphicsRunner();
	}
}
