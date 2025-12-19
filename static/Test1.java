class Test1{
    static int count = 0;

    Test1(){
        count++;
    }

    public static void main(String[] args) {
        new Test1();
        new Test1();
        new Test1();
        System.out.println(count);
    }
}