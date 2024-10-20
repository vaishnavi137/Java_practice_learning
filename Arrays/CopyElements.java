public class CopyElements {
    
    public static void main(String args[]){


        int arr[]=new int[]{10,20,30,40,50};

        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

        System.out.println("original elements:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

        System.out.println("copy elements:");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+ " ");
        }



    }
}
