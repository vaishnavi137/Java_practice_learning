public class Frequency {

    public static  void main(String args[]){

        int arr1[]=new int[]{1,2,2,4,1,3,1};

        int []fr=new int[arr1.length];

        int visited=-1;

        for(int i=0;i<arr1.length;i++){
            int count=1;
            for(int j=i+1;j<arr1.length;j++){
                    if(arr1[i]==arr1[j]){
                        count++;
                        //to avoid counting same element agian
                        fr[j]=visited;
                    }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }



        }
        //Displaying elements
        System.out.println("Element frequency:");
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited)
                System.out.println(" " +arr1[i] + " " +fr[i]);
        }















    }







}
