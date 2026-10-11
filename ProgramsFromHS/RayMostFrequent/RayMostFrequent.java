public class RayMostFreq {
 public static int go(int[] ray) {
	int rayLength=ray.length;
	int frqwt=0;
	int OldFrqwt=0;
	for(int i=0;i<rayLength;i++) {
	  int frequency=1;
	  for(int q=0;q<i-1;q++) {
	    if(ray[i]==ray[q]) {
		  frequency++;
	    }
	  }
	  for(int w=i+1;w<rayLength;w++) {
		if(ray[i]==ray[w]) {
		  frequency++;
		}
	  }
	  if(frequency>OldFrqwt) {
		OldFrqwt=frequency;
		frqwt=ray[i];
	  }
	}
	return frqwt;
 }
}
