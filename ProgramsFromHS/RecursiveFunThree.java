/Ray
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class RecursionFunThree {
	public static int countThrees(int v) {
		if(v<10) {
			return 0;
		}
		String s=v+"";
		if(s.substring(s.length()-1).equals("3")) {
			return 1+countThrees((int)v/10);
		}
		return countThrees((int)v/10);
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
		System.out.println(RecursionFunThree.countThrees(345222));
		System.out.println(RecursionFunThree.countThrees(737458));
		System.out.println(RecursionFunThree.countThrees(533295));
		System.out.println(RecursionFunThree.countThrees(533385));
		System.out.println(RecursionFunThree.countThrees(733332));
		System.out.println(RecursionFunThree.countThrees(333333));
	}
}

/*Output:
0
1
2
3
4
5*/