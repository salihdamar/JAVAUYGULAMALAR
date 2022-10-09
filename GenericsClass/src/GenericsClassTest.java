public class GenericsClassTest<T1,T2,T3> {
    private T1 obj1;
    private T2 obj2;
    private T3 obj3;

    public GenericsClassTest(T1 obj1, T2 obj2, T3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T1 getObj1() {
        return obj1;
    }

    public void setObj1(T1 obj1) {
        this.obj1 = obj1;
    }

    public T2 getObj2() {
        return obj2;
    }

    public void setObj2(T2 obj2) {
        this.obj2 = obj2;
    }

    public T3 getObj3() {
        return obj3;
    }

    public void setObj3(T3 obj3) {
        this.obj3 = obj3;
    }
     public void showInfo(){
         System.out.println("T1 : "+obj1 + ":"+ obj1.getClass().getSimpleName());
         System.out.println("T2 : "+obj2 + ":"+obj2.getClass().getSimpleName());
         System.out.println("T3 : "+obj3 + ":"+obj3.getClass().getSimpleName());

     }
}
