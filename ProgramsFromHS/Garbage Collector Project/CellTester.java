//CellTester
import java.awt.Color;
public class CellTester {
   public static void main(String[] args) {
       ColoredCell cell1 = new ColoredCell(5, 5, 5, 5, false, Color.BLUE);
       System.out.println(cell1);
      
       ColoredCell cell2 = new ColoredCell(5, 5, 5, 5, false, Color.BLUE);
       System.out.println(cell2);
       ColoredCell cell3 = new ColoredCell(100, 100, 5, 5, true, Color.BLUE);
       System.out.println(cell3);
       ColoredCell cell4 = new ColoredCell(200, 200, 20, 20, true, Color.GREEN);
       System.out.println(cell4);
      
   }
}