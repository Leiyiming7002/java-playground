import java.util.Scanner;

// 简单计算器程序：读取两个整数并输出常见运算结果
public class Calc {
    // 程序入口
    public static void main(String[] args) {
        // 使用 try-with-resources 自动关闭输入流，符合资源管理规范
        try (Scanner scanner = new Scanner(System.in)) {

            // 提示并读取第一个整数 a
            System.out.print("请输入a:");
            int a = scanner.nextInt();

            // 提示并读取第二个整数 b
            System.out.print("请输入b:");
            int b = scanner.nextInt();

            // 输出加法结果
            System.out.println("a + b = " + (a + b));
            // 输出减法结果
            System.out.println("a - b = " + (a - b));
            // 输出乘法结果
            System.out.println("a * b = " + (a * b));

            // 对除法和取余做除零保护，避免运行时异常
            if (b != 0) {
                // 输出整除结果（Java int / int 为整数除法）
                System.out.println("a / b = " + (a / b));
                // 输出取余结果
                System.out.println("a % b = " + (a % b));
            } else {
                // b 为 0 时提示无法进行除法和取余
                System.out.println("a / b = 无法计算（除数不能为 0）");
                System.out.println("a % b = 无法计算（除数不能为 0）");
            }
        }
    }
}