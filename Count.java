class CountClass{
    static int count = 0;
    CountClass(){
        count++;
    }
}

public class Count {
    public static void main(String[] args) {
        CountClass obj1 = new CountClass();
    CountClass obj2 = new CountClass();
    CountClass obj3 = new CountClass();
    CountClass obj4 = new CountClass();

    System.out.println("count of object called = "+obj4.count);
    }
}
