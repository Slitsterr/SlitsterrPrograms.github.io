//Cell
import java.awt.Graphics;
public abstract class Cell implements Locatable {
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   public Cell() {
       xPos = 0;
       yPos = 0;
       width = 0;
       height = 0;
   }
   public Cell(int x, int y, int w, int h) {
       xPos = x;
       yPos = y;
       width = w;
       height = h;
   }
   public void setPos(int x, int y) {
       xPos = x;
       yPos = y;
   }
   public void setX(int x) {
       xPos = x;
   }
   public void setY(int y) {
       yPos = y;
   }
   public int getX() {
       return xPos;
   }
   public int getY() {
       return yPos;
   }
   public int getWidth() {
       return width;
   }
   public int getHeight() {
       return height;
   }
   public void setWidth(int w) {
       width = w;
   }
   public void setHeight(int h) {
       height = h;
   }
   public abstract void draw(Graphics window);
   public String toString() {
       return xPos + " " + yPos + " " + width + " " + height;
   }
}