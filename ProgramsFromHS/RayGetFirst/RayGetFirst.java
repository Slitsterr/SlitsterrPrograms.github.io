public class RayGetFirst {
 public static int[] go(int[] ray) {
	int length=ray.length;
	int aryLength=0;
	int first=ray[0];
	int ary[]=new int[length];
	for(int i=1;i<length;i++) {
	  if(ray[i]>first) {
		ary[aryLength]=ray[i];
		aryLength++;
	  }
	}
	int n=0;
	int ary2[]=new int[aryLength];
	for(int i=0;i<aryLength;i++) {
	  ary2[i]=ary[i];
	}
	return ary2;
 }
}
