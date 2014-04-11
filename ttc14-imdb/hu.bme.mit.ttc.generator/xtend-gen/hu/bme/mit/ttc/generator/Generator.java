package hu.bme.mit.ttc.generator;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Generator {
  public void createExample(final int N) {
    int _minus = (N - 1);
    IntegerRange _upTo = new IntegerRange(0, _minus);
    final Procedure1<Integer> _function = new Procedure1<Integer>() {
      public void apply(final Integer it) {
        Generator.this.createTest((it).intValue());
      }
    };
    IterableExtensions.<Integer>forEach(_upTo, _function);
  }
  
  public Integer createTest(final int n) {
    Integer _println = InputOutput.<Integer>println(Integer.valueOf(n));
    return _println;
  }
}
