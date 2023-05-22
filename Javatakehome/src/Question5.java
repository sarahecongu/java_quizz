import com.sun.source.tree.WhileLoopTree;

public class Question5 {
    public static void main(String[] args) {
        int num1=123456789,evenCount = 0,oddCount = 0;
        while (num1 > 0)
        {
            if (num1 % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            num1 /= 10;
        }
        System.out.println("number of even numbers " + evenCount);
        System.out.println("number of odd numbers " + oddCount);
    }
}
