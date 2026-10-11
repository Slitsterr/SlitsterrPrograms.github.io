//pong
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	public Pong()
	{
		ball= new Ball();
		leftPaddle= new Paddle(150,5,5,100,5);
		rightPaddle= new Paddle(650,5,5,100,5);
		keys = new boolean[4];
  
   	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
  public void update(Graphics window){
	   paint(window);
  }
  public void paint(Graphics window)
  {
		//set up the double buffering to make the game animation nice and smooth
		/*Graphics2D twoDGraph = (Graphics2D)window;
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
*/
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		rightPaddle.draw(window);
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the top or bottom wall
		if(ball.getY()>=580||ball.getY()<=10) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits the left paddle
		if(ball.getX()<=leftPaddle.getX()+leftPaddle.getW()+Math.abs(ball.getXSpeed())&&
			(ball.getY()>=leftPaddle.getY()&&ball.getY()<=leftPaddle.getY()+leftPaddle.getH()||
			ball.getY()+ball.getH()>=leftPaddle.getY()&&
			ball.getY()+ball.getH()<leftPaddle.getY()+leftPaddle.getH())) {
			if(ball.getX()<=leftPaddle.getX()+leftPaddle.getW()-Math.abs(ball.getXSpeed()))ball.setYSpeed(-ball.getYSpeed());
			else ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		//see if the ball hits the right paddle
		if(ball.getX()<=rightPaddle.getX()+rightPaddle.getW()+Math.abs(ball.getXSpeed())&&
				(ball.getY()>=rightPaddle.getY()&&ball.getY()<=rightPaddle.getY()+rightPaddle.getH()||
				ball.getY()+ball.getH()>=rightPaddle.getY()&&
				ball.getY()+ball.getH()<rightPaddle.getY()+rightPaddle.getH())) {
				if(ball.getX()<=rightPaddle.getX()+rightPaddle.getW()-Math.abs(ball.getXSpeed()))ball.setYSpeed(ball.getYSpeed());
				else ball.setXSpeed(-ball.getXSpeed());
			}
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(window);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(window);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(window);
		}
		
		//twoDGraph.drawImage(back, null, 0, 0);
	}
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		case 'W' : keys[0]=true; break;
		case 'S' : keys[1]=true; break;
		case 'P' : keys[2]=true; break;
		case 'L' : keys[3]=true; break;
		}
	}
	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		case 'W' : keys[0]=false; break;
		case 'S' : keys[1]=false; break;
		case 'P' : keys[2]=false; break;
		case 'L' : keys[3]=false; break;
		}
	}
	public void keyTyped(KeyEvent e){}
	
  public void run()
  {
  	try
  	{
  		while(true)
  		{
  		   Thread.currentThread().sleep(8);
           repaint();
        }
     }catch(Exception e)
     {
     }
 	}	
}
//TheGame
import javax.swing.JFrame;
import java.awt.Component;
public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();
		
		((Component)game).setFocusable(true);
		getContentPane().add(game);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
