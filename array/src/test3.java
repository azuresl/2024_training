public class test3 {
    // 定义两个变量，交换变量记录的值
    // 定义一个临时的第三方变量
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0,j = arr.length - 1;i < j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
