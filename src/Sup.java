import java.util.function.Supplier;

/**
 * Created by dirceu on 10/4/14.
 */
public class Sup {
    public static void main(String[] args)  {
        Supplier<Integer> sup = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return null;
            }
        };
    }
}
