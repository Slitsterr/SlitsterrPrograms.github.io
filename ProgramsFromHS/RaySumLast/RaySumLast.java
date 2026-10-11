public class RaySumLast{
 public static int go(int[] ray){
   int last=ray[ray.length-1];
   int sum=0;
   for(int i=0;i<ray.length;i++) {
     if(ray[i]>last) {
   	sum+=ray[i];
     }
   }
   if(sum==0) {
     return -1;
   }
   else {
     return sum;
   }
 }
}
