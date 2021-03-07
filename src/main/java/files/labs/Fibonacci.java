package files.labs;
import java.util.Arrays;

public class Fibonacci {
  //recursive method
  public int frec(int n) {
    if (n <= 1) {
      return n;
    }
    return frec(n-1) + frec(n-2);
  }
  //iterative method
  public long[] fi(int n) {
    long[] fibo = new long[n];
    long preprevious;
    long previous = 0;
    long current = 1;
    fibo[0] = 0;
    fibo[1] = 1;
    for (int i = 2; i < n; i++) {
      preprevious = previous;
      previous = current;
      current = preprevious + previous;
      fibo[i] = current;
    }
    return fibo;
  }
  public String returnFib(int num) {
    long[] arr = new long[num];
    arr = fi(num);
    String line = "The fibonacci sequence is " + Arrays.toString(arr);
    return line;
  }
}
