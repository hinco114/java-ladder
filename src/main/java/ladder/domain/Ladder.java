package ladder.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private final List<Lines> linesByLevel;

    public Ladder(int lineQuantity, int lineHeight) {
        this.linesByLevel = IntStream.range(0, lineHeight)
                .mapToObj(i -> new Lines(lineQuantity))
                .collect(Collectors.toList());
    }

    private Ladder(List<Lines> linesByLevel) {
        this.linesByLevel = linesByLevel;
    }

    public static Ladder of(List<Lines> linesList) {
        return new Ladder(linesList);
    }

    public Lines linesByLevel(int level) {
        return linesByLevel.get(level);
    }

    public int height() {
        return linesByLevel.size();
    }
}
