package medium;

public class exercicio04 {
    public static void main(String[] args) {

        int i = 1, multi = 1;
        while (i <= 1000) {
            multi = i * multi;
            if (multi >= 1000) {
                multi = 1;
            }
            System.out.println(multi);
            i++;
        }

    }

}
