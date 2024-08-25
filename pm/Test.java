public class Test {
  public static void main(String[] args) {
    RevisaoAed revisaoAed = new RevisaoAed();
    
    int res=revisaoAed.fibLoop(6);
    System.out.println(res);
    res = revisaoAed.FibRec(6);
    System.out.println(res);
  }
}
