public class work5 {
    public static void main(String[] args) {
        int[] num = new int[15];
        int Numbers= 0;
        System.out.println("Масив випадкових чисел:");
        for (int a = 0; a < num.length; a++) {
            num[a] = (int) Math.round(Math.random() * 10);
            System.out.print(num[a] + "; ");
            if(num[a] % 2 == 0) {
                Numbers++;
            }
        }
        System.out.println("Кількість парних чисел у цьому масиві:" + Numbers);
    }
}
