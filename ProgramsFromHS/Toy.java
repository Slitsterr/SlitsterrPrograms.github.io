//Toy
public class Toy {
	public String grab;
	public int cnt=1;
	public Toy(String s) {
		grab= s;
	}
	public int getCount() {
		return cnt;
	}
	public String getName() {
		return grab;
	}
	public void setCount(int x) {
		cnt=x;
	}
	public String toString() {
		return grab+" "+cnt;
	}
}
/*output
1
sorry 1
sorry
1
5
ji goe 5*/