public class work3 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][5];
        int[] chisla = new int[3];
        for (int a = 0; a < 3; a++) {
            System.out.println("Масив №" + (a + 1) + ":");
            for (int b = 0; b < 5; b++) {
                numbers[a][b] = (int) Math.round(Math.random() * 5);
                chisla[a] += numbers[a][b];
                System.out.print(numbers[a][b] + "; ");
            }
            chisla[a] /= 5;
            System.out.printf("Середнє арифметичне №%d=%d", a+1, chisla[a]);
        }
        int c = 0;
        int d = 0;
        int f = 0;
        for (int i = 0; i < 3; i++) {
            if (chisla[i] > c) {
                f = d;
                d = c;
                c = chisla[i];
            }else if (chisla[i] > d) {
                f = d;
                d = chisla[i];
            }else {
                f = chisla[i];
            }
        }
        if (c == d) {
            if (d == f) {
                System.out.println(c+"="+d+"="+f);
            }else {
                System.out.println(c+"="+d+">"+f);
            }
        }else if (d == f) {
            System.out.println(c+">"+d+"="+f);
        }else {
            System.out.println(c+">"+d+">"+f);
        }
    }
}
