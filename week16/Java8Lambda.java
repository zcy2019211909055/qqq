/**
 * author: zc
 * date: 2020.12.29
 * description: Code about Java8 Lambda
 */
package week16;


public class Java8Lambda {
    interface MathOperation {
        int operation(int a, int b);
    }
    
    interface GreetingService {
        void sayMessage(String message);
    }
    
    private int operate(int a,int b,MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
    
    public static void main(String[] args) {
        Java8Lambda tester = new Java8Lambda();

        /**
         * 类型说明
         */
        MathOperation addition = (int a,int b) -> a+b;

        /**
         * 不用类型说明
         */
        MathOperation subtraction = (a,b) -> a-b;

        /**
         * 大括号中的返回语句
         */
        MathOperation multiplication = (int a,int b) -> { return a*b; };

        /**
         * 没有大括号及返回语句
         */
        MathOperation division = (int a,int b) -> a/b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 X 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        /**
         * 不用括号
         */
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        /**
         * 用括号
         */
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);
        
        greetService1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");
    }
}