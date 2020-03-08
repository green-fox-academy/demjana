public class Practice {
    public static void main(String[] args) {
        int szam1 = 660;
        int szam2 = 360;
        while (szam1 != szam2) {
            if (szam1 > szam2) {
                szam1 = szam1 - szam2;
            } else {
                szam2 = szam2 - szam1;
            }
        }
        System.out.println("A ket szam legnagyobb kozos osztoja: " + szam1);
    }
}
