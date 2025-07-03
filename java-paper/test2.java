public class test2 {
    public static void main(String[] args) {
        int[] src = {12, 2, 33, 54};
        int[] dest = new int[5];

        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.print("My:");

        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + ","); // 输出：12,2,33,54,0
        }
    }
}