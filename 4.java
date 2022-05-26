public class work4 {
    public static void main(String[] args) {
        int[][] a = new int[3][10];
        for (int i = 0; i < 10; i++) {
            a[0][i] = (int) Math.round(Math.random()*10);
            a[1][i] = (int) Math.round(Math.random()*10);
            a[2][i] =a[0][i]+a[1][i];
        }
        for (int c = 0; c < a.length; c++) {
            System.out.println("Масив №" + (c+1));
            for (int d = 0; d < a[c].length; d++) {
                System.out.print(a[c][d]+";");
            }
            System.out.println();
            System.out.println();
        }
    }
}
