package generator;

import java.util.List;

@FunctionalInterface
public interface BooleansGenerator {
    List<Boolean> generate(int size);
}
