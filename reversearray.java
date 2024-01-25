import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int revarr[]={0,0,0,0,0};
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            
           // in this loop the iteration happens in the reverse order 
            
            revarr[j]=arr[i];
            }
            System.out.println(Arrays.toString(revarr));

    }
  
    }
