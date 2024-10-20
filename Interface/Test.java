package Interface;
interface printable{
    void print();
}


class Test implements printable  {
   public  void print(){
        System.out.println("::hello");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.print();
    }
}
