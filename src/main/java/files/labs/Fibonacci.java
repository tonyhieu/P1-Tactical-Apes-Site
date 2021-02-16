public class Fibonacci {
  //recursive method
  public int frec(int n) {
    if (n <= 1) {
      return n;
    }
    return frec(n-1) + frec(n-2);
  }
  //iterative method
  public int fi(int n) {
    int preprevious;
    int previous = 0;
    int current = 1;
    if (n <= 1) {
      return n;
    }
    for (i = 1; i < n; i++) {
      int preprevious = previous;
      int previous = current;
      int current = preprevious + previous;
    }
    return current;
  }
}
