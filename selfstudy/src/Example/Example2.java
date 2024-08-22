package Example;

class Parent {
    public void show() {
        System.out.println("부모 클래스의 show() 메서드");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("자식 클래스의 show() 메서드");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.show(); // 부모 클래스의 show() 메서드 호출
        child.show(); // 자식 클래스의 show() 메서드 호출
    }
}