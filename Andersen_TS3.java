public class Andersen_TS3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        int[] array = new int[(y-x)+1];

        for (int i = 0; i < array.length; i++) {
            array[i] = x;
            x++;
        }
        for (int s = 0; s < array.length; s++) {
            if (array[s]>0) {
                if (array[s]%3 == 0) {
                    System.out.println(array[s]);
                }
            }
        }
    }
}
