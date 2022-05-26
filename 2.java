public class work2 {
    public static void main(String[] args) {
        int[] first = new int[20];
        System.out.println("Old masif:");
        for (int b = 0; b < 20; b++) {
            first[b] = (int) Math.round(Math.random() * 9);
            System.out.print(first[b] + "; ");
            if (b % 2 == 1) {
                first[b] = 0;
            }
        }
        System.out.println("New masif:");
        for (int c = 0; c < 20; c++) {
            System.out.print(first[c] + "; ");
        }
    }
}
