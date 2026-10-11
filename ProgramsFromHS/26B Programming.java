import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Abraham {
	public static void main(String args[])throws IOException {
		ArrayList <Integer> x= new ArrayList<Integer>();
		Scanner file= new Scanner(new File ("abraham.dat"));
		int n= Integer.parseInt(file.nextLine());
		double cnt=0;
		double totalCnt=0;
		for(int i=0;i<n;i++) {
			String s= file.next();
			if(s.equals("Abraham"))cnt++;;
			totalCnt++;
		}
		out.println((int)cnt);
		if(cnt/totalCnt>.5)out.println("Honest Abe");
		else out.println("Better find a hobby");
		file.close();
		}
}
/*Output
5
Better find a hobby
Data 
20
Abraham
Abraham
Jonathan
Abraham
Juliet
David
Jackie
Danny
Rahul
Tristan
Christian
Christian
Christian
Christian
Christian
Abraham
Abraham
Christian
Christian
Christian
*/

//Rey
import java.io.*;
import java.util.*;
import static java.lang.System.*;
public class Rey {
	private String name;
	private double total;
	
	public Rey(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public double addItem(String item, String size) {
		double price=0;
		if(item.equals("Hoodie"))price=30;
		if(item.equals("TShirt"))price=15;
		if(size.equals("XL")||size.equals("XXL"))price+=2.5;
		total+=price;
		return price;
	}
	
	public double getTotal() {
		return total;
	}
	
	public static void main(String args[])throws IOException {
	ArrayList <Rey> x= new ArrayList<Rey>();
	Scanner file= new Scanner(new File ("rey.dat"));
	int cnt=0;
	while(file.hasNext()) {
		x.add(new Rey(file.nextLine()));
		int n= Integer.parseInt(file.nextLine());
		System.out.println("INVOICE FOR: "+x.get(cnt).getName());
		out.println("---------------------------");
	for(int i=0;i<n;i++) {
		Scanner chop=new Scanner(file.nextLine());
		String item= chop.next();
		String size=chop.next();
		System.out.printf("%-7s%-11s$ %.2f\n", item,"("+size+")",x.get(cnt).addItem(item, size));
		
	}
	out.println("---------------------------");
	out.printf("Total Due:        $ %.2f",x.get(cnt).getTotal());
	out.println("\n");
	cnt++;
	}
	file.close();
	}
}

/*Output
INVOICE FOR: Mr.Miller
---------------------------
Hoodie (M)        $ 30.00
TShirt (XL)       $ 17.50
Hoodie (XL)       $ 32.50
---------------------------
Total Due:        $ 80.00
INVOICE FOR: Ms.Garcia
---------------------------
TShirt (S)        $ 15.00
TShirt (M)        $ 15.00
---------------------------
Total Due:        $ 30.00

Data
Mr.Miller
3
Hoodie M
TShirt XL
Hoodie XL
Ms.Garcia
2
TShirt S
TShirt M*/
