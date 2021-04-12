import javax.annotation.Nullable;
import org.checkerframework.checker.signedness.qual.*;

/**
 * Some Javadoc <a href="lol.html">hehe</a> haha<script>alert('hello');</script>.
 * <i>foo</i> <b>bar</b> haha.
 * <p><another paragraph/p>
 */
@Deprecated
class C1<T extends Exception> extends Object {
  private Object f1;
  private @Nullable @Deprecated Object f2;
  private C1 f3;
  private C1<RuntimeException> f4;
  private int f5 = 1
    + 2
    + 3;
  private Object f6 = new Object(){
    public String toString() {
      return "test";
    }
  };
  String f7 = "hehe";

  /**
   * Bla bla.
   *
   * More bla bla
   *
   * @param p1 does something
   */
  void m1(T p1) {
  }

  /**
   * Hey what's up
   *
   * @param p2 some parameter.
   * @return some value.
   */
  T m2(@Nullable T p2) {
    return null;
  }

  void m3() {
    m1(m2(null));
  }
  
  @Unsigned int m4() {
    return 42;
  }
  
  void m5() {
    var l1 = m4();
    
    @Acceleration
    var l2 = m4();
  }
}
