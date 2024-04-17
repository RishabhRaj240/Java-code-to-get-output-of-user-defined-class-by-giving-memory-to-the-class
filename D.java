class D {
    void m1() {
         System.out.println("m1 is executed");
    }

    public static void main(String[] args) {
         System.out.println("main is executed");
         
         D d1 = new D();
         d1.m1();
    }
}