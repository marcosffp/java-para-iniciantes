public class RevisaoAed {

  public int fibLoop(int n) {
    if (n <= 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      int a = 0, b = 1, c;
      for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
      }
      return b;
    }
  }
  
  public int FibRec(int n) {
    if (n <= 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      int res;
      res = FibRec(n - 2) + FibRec(n - 1);
      return res;
      
    }
  }
}
