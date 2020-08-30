package SelfPractices;

public class Constructor {
    public Constructor(String arr){
        System.out.println("hello "+arr);
        System.out.println("hi "+arr);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("ali");
        Constructor obj1 = new Constructor("bo");
    }

}
