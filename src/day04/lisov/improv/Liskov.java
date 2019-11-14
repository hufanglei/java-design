package day04.lisov.improv;

public class Liskov {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        //因为B类不再集成A类，因此调用者，不会再func1求减法，
        //调用完成的工具就很完善
        System.out.println("11+3=" + b.func1(11, 3));//这里本意是求出11-3
        System.out.println("1+8=" + b.func1(1, 8));// 1-8
        System.out.println("11+3+3=" + b.func2(11, 3));
        //使用组合仍然可以使用A类相关方法
        System.out.println("11-3=" + b.func3(11, 3));
    }
}
class Base{
}
// A类
class  A extends Base{
    // 返回两个数的差
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}
// B类继承了A
// 增加了一个新功能：完成两个数相加,然后和9求和
class B extends Base {
    private A a = new A();
    //这里，重写了A类的方法, 可能是无意识
    public int func1(int a, int b){
        return a + b;
    }
    public int func2(int a, int b){
        return func1(a,b) + b;
    }
    public int func3(int a, int b){
        return  this.a.func1(a, b);
    }
}
