public clpublic class RayDown {
 public static boolean go(int[] numArray) {
	int length=numArray.length;
	boolean isDown=true;
	for(int i=1;i<length;i++) {
	  int prev=numArray[i-1];
	  if(numArray[i]>=prev) {
	    isDown=false;
	    break;
	  }
   }
	return isDown;
 }	
}
