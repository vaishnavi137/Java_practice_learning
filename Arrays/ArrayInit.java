package Arrays;

public class ArrayInit {
    
    public static void main (String args[]){
            int [] a=new int[10];

            a[0]=6;
            a[1]=5;
            a[2]=65;
            a[3]=56;
            a[4]=34;
            a[5]=65;
            a[6]=87;
            a[7]=43;
            a[8]=22;
            a[9]=21;

            int y=0;
            for(int i=0;i<a.length;i++){
            System.out.println("array of  " + i +":" + a[i]);
                 y=i+20*300;
                a[i]=y;

               

            }
            System.out.println("array of  "  + y);








    }




}
