public class RayFirst{
 public static boolean go(int[] ray){
   int first=ray[0];
   boolean b=false;
	for(int i=1;i<ray.length;i++) {
	  if(ray[i]==first) {
       b=true;
	  }
   }
	return b;
 }
}
