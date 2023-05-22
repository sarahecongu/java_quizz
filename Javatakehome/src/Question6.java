public class Question6 {
    public static void main(String[] args) {
        int k = 0,sum = 0;
        int[] array = new int[]{1,2,3,4,5,6};
        while (k<array.length){
            sum = sum + array[k];
            k++;
        }
        System.out.println("The sum is "+ sum);
    }
}
