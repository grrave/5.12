public class work6 {
    public static void main(String[] args) {
        int[][] mak = new int[15][];
        for (int a = 0; a < mak.length; a++) {
            if (a < 4) {
                mak[a] = new int[5];
            }else if (a < 8) {
                mak[a] = new int[8];
            }else if (a < 12) {
                mak[a] = new int[3];
            }else {
                mak[a] = new int[9];
            }
            System.out.println("Масив №" + (a + 1) + ":");
            for (int b = 0; b < mak[a].length; b++) {
                mak[a][b] = (int) Math.round(Math.random() * 15);
                System.out.print(mak[a][b] + ";");
            }
            System.out.println();
            System.out.println();
        }
    }
}
