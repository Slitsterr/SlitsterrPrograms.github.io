public class RayGetNums {
 public static int[] go(int[] ray) {
	int length=ray.length;
	int n=0;
	int ary[]=new int[3];
	for(int i=0;i<length;i++) {
	  if(ray[i]>11) {
		if(n<=2) {
		  ary[n]=ray[i];
		  n++;
		}
	  }
	}
	return ary;
 }
}
