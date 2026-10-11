public class RayTotal{
 public static int go(int[] ray){
	int total=0;
	int len=ray.length;
	for(int i=0;i<len;i++) {
	  total+=ray[i];
	}
   return total;
 }
}
