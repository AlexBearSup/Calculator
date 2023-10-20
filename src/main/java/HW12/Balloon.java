package HW12;

public class Balloon {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int count = 0;

        for (char symbol : text.toCharArray()) {
            switch (symbol) {
                case ('b') -> b++;
                case ('a') -> a++;
                case ('l') -> l++;
                case ('o') -> o++;
                case ('n') -> n++;
            }
            if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1) {
                count++;
                b -= 1;
                a -= 1;
                l -= 2;
                o -= 2;
                n -= 1;
            }
        }
        return count;
    }
}
