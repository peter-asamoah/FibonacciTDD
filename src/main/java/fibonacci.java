public class fibonacci {
 int n;
int result = 0;
    public fibonacci() {

    }

    public int fib(int n) {

        if (n < 0 || n == 0) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return  0;
        } else if (n == 2) {
            return 1;
        } else {
            result = 1;
            for (int u = 3; u < n; u++) {
                int s = fib(u - 1);
                int r = fib(n - 2);
               result = s + r;
            }


        }
return result;
    }






}
