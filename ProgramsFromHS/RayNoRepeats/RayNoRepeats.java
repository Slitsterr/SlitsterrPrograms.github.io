public class RayNoRepeats {
 public static boolean go(int[] ray) {
	int rayLength=ray.length;
	boolean rpt=false;
	for(int i=0;i<rayLength;i++) {
	  for(int q=0;q<i-1;q++) {
	    if(ray[i]==ray[q]) {
		  rpt=true;
		  break;
	    }
	  }
	  for(int w=i+1;w<rayLength;w++) {
		if(ray[i]==ray[w]) {
		  rpt=true;
		  break;
		}
	  }
	  if(rpt) {
		break;
	  }
	}
	return !rpt;
 }
}
