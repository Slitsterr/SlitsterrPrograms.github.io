//ToyStore
mport java.io.*;
import java.util.*;
public class ToyStore {
	private ArrayList<Toy> toys;
	public ToyStore() {
		toys=new ArrayList<Toy>();
	}
	public void loadToys(String[]s) {
		toys.clear();
		for(String i:s) {
			int count=0;
			Toy t=new Toy(i);
			toys.add(t);
			toys.get(count).setCount(toys.get(count).getCount()+1);
			count++;
		}
	}
	public int getThatToy(String s) {
		System.out.print(s+" ");
		int count=0;
		for(int i=0;i<toys.size();i++) {
			if(toys.get(i).getName().equals(s)) {
				count++;
			}
		}
		return count;
	}
	public String getMostFrequentToy() {
		int count=0;
		int max=0;
		String maxname="";
		ArrayList<Toy> knowns=new ArrayList<Toy>();
		knowns.add(toys.get(0));
		for(int i=0;i<toys.size();i++) {
for(int ii=0;ii<knowns.size();ii++) {
if(toys.get(i).equals(knowns.get(ii))) {
knowns.get(ii).setCount(knowns.get(ii).getCount()+1);
}
if(knowns.size()<i)knowns.add(toys.get(i));
if(toys.get(i).getName().equals(maxname)) {
				max++;
			} else {
				toys.get(i).setCount(toys.get(i).getCount()+1);
		}
		if(toys.get(i).getCount()>max) {
			max=toys.get(i).getCount();
			maxname=toys.get(i).getName();
		}
}
		}
return maxname;
		}
public String sort() {
	ArrayList<Toy> knowns=new ArrayList<Toy>();
	ArrayList<Integer> ints=new ArrayList<Integer>();
	boolean b=false;
	String s="[";
	int count=0;
	if(toys.size()>0) {
	knowns.add(toys.get(0));
	for(int i=0;i<toys.size();i++) {
		toys.get(i).setCount(0);
	}
		for(int ii=0;ii<toys.size();ii++) {
			b=false;
			count=0;
			for(int i=0;i<knowns.size();i++) {
				if(toys.get(ii).getName().equals(knowns.get(i).getName())) {
				knowns.get(i).setCount(knowns.get(i).getCount()+1);
				break;
			} else {
				count++;
			}
			}
			if(count==knowns.size()) b=true;
			if(b==true) {
				toys.get(ii).setCount(1);
				knowns.add(toys.get(ii));
			}
		}
		for(int ii=0;ii<knowns.size();ii++) {
			ints.add(knowns.get(ii).getCount());
		}
	}
	Collections.sort(ints);
	//Collections.reverse(ints);
		int count2=0;
	for(int i=0;i<knowns.size();i++) {
		for(int ii=0;ii<knowns.size();ii++) {
			if(ints.get(i)==knowns.get(ii).getCount()) {
				String name=knowns.get(count2).getName();
				int num=knowns.get(count2).getCount();
				Toy toy=new Toy(name);
				knowns.set(count2,knowns.get(ii));
				toy.setCount(num);
				knowns.set(ii,toy);
				count2++;
			}
		}
	}
		s+=knowns.get(0);
	for(int i=1;i<knowns.size();i++) {
		s+=", "+ knowns.get(i);
	}
	s+="]";
	return s;
}
public String toString() {
	ArrayList<Toy> knowns=new ArrayList<Toy>();
	String s="[";
	boolean b=false;
	int count=0;
	if(toys.size()>0) {
	knowns.add(toys.get(0));
	for(int i=0;i<toys.size();i++) {
		toys.get(i).setCount(0);
	}
		for(int ii=0;ii<toys.size();ii++) {
			b=false;
			count=0;
			for(int i=0;i<knowns.size();i++) {
				if(toys.get(ii).getName().equals(knowns.get(i).getName())) {
				knowns.get(i).setCount(knowns.get(i).getCount()+1);
				break;
			} else {
				count++;
			}
			}
			if(count==knowns.size()) b=true;
			if(b==true) {
				toys.get(ii).setCount(1);
				knowns.add(toys.get(ii));
			}
		}
		s+=knowns.get(0).getName()+" "+knowns.get(0).getCount();
		for(int i=1;i<knowns.size();i++) {
		s+=", "+ knowns.get(i).getName()+" "+knowns.get(i).getCount();
		}
	}
	s+="]";
	return s;
	}
}
