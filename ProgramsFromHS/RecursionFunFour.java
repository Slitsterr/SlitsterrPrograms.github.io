public class RecursionFunFour {
	public static int countOddDigits(int v) {
		if(v<1) {
			return 0;
		}
		if(v%2!=0) {
			return 1+countOddDigits((int)v/10);
		}
		return countOddDigits((int)v/10);
	}
}

//Runner
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class RecursionRunner
{
	public static void main(String args[])
	{
		System.out.println(RecursionFunFour.countOddDigits(346222));
		System.out.println(RecursionFunFour.countOddDigits(736488));
		System.out.println(RecursionFunFour.countOddDigits(533264));
		System.out.println(RecursionFunFour.countOddDigits(533382));
		System.out.println(RecursionFunFour.countOddDigits(733332));
		System.out.println(RecursionFunFour.countOddDigits(333333));
	}
}

/*Output:
1
2
3
4
5
6*/