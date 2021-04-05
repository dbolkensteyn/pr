import javax.annotation.Nullable;

/**
 * Some Javadoc <a href="lol.html">hehe</a> haha<script>alert('hello');</script>.
 * <i>foo</i> <b>bar</b> haha.
 * <p><another paragraph/p>
 */
@Deprecated
class C1<T extends Exception> extends Object {
  private Object f1;
  private @Nullable Object f2;
  private C1 f3;
  private C1<RuntimeException> f4;

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
}
