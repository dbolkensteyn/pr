import javax.annotation.Nullable;
import org.checkerframework.checker.units.qual.*;
import org.checkerframework.checker.signedness.qual.*;
import java.util.*;

import java.io.Serializable;

class Cyclic0 extends Cyclic0 {
}

class Cyclic1<T extends Cyclic1<T>> {
}

abstract class Cyclic2<T> {
  abstract <T extends Cyclic2<T>> void m(T p);
}

@java.lang.annotation.Inherited
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
public @interface CustomAnnotation {
}

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
  private Object f6b = new Runnable(){
    public void run(){}
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
  T m2(@Signed T p2) {
    System.out.println(p2);
    return null;
  }

  void m3() {
    m1(m2(null));
  }
  
  @Unsigned int m4() {
    return 42;
  }
  
  int m4(Object p1, Object p2) {
    return 0;
  }
  
  @Deprecated
  @CustomAnnotation @Unsigned int m4b() {
    return 42;
  }
  
  void m5() {
    var l1 = m4();
    
    @Acceleration
    var l2 = m4();
    
    var l3 = m4b();
    
    @Acceleration
    var l4 = m4b();
  }
  
  final <T2 extends Object> void m6() {
    T2 l1;
    T l2;
  }
  
  <T2, T3> void m6b() {
    T l0;
    T2 l1;
    @TypeUseAnnotation T3 l2;
    int l3 = 0;
  }
  
  int m6b(Object p1) {
    return m6b();
  }
  
  @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.FIELD})
  @interface TypeUseAnnotation {
  }
  
  class C2<@TypeUseAnnotation T1, T2 extends @TypeUseAnnotation Exception & Serializable> extends Exception implements Serializable {
    T1 f1;
    T2 f2;
    @TypeUseAnnotation T2 f3;
  }
  
  C2<Integer, C2> f8;
  
  List f9;
  List<?> f10;
  List<  /* foo */  ? extends Number> f11;
  List<  @TypeUseAnnotation  /*/?*/ ? extends Number> f11b;
  List<  @TypeUseAnnotation  /*/?*/ // foo
    // haha
    /*/***/ ? /* hoho */ extends Number> f11c;
  
  Unknown<?> f12;

  enum E1 {
    A, B, C;
  }
  
  E1 f13 = E1.A;
  
  @TypeUseAnnotation List f14; 
  
  int m7(int p1, @Unsigned int p2, int p3, @Signed int p4) {
    return p1 + p2 + p3 + p4;
  }
  
  int[] fa1;
  int @TypeUseAnnotation[] fa2;
  int @TypeUseAnnotation[][] fa3;
  int @TypeUseAnnotation[] @TypeUseAnnotation[] fa4;
  
  void m8() {
    java.util.List<String> myList =
    java.util.Arrays.asList("a1", "a2", "b1", "c2", "c1");

    myList
      .stream()
      .filter(s -> s.startsWith("c"))
      .map(String::toUpperCase)
      .sorted()
      .forEach(System.out::println);
  }

  int m9(int p1, int p2, int... ps) {
    m9(0, 1, 2, 3, 4, 5);
    return p1 + p2 + ps.length;
  }
  
  Object m10() {
    try {
    } catch (ArrayIndexOutOfBoundsException e) {
      return e;
    } catch (IllegalStateException|UnsupportedOperationException e) {
      return e;
    }

    var li1 = (java.io.Serializable & Runnable) () -> System.out.println();

    return null;
  }
}
