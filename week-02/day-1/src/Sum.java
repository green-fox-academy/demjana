public class Sum {
    public static void main(String[] args) {
        int[] myList = {3, 4, 5, 6, 7};
        int total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
    }
}