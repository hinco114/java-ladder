package ladder.domain;

import static java.lang.Boolean.FALSE;

public class Point {
    private final int index;
    private final Direction direction;

    private Point(int index, Direction direction) {
        this.index = index;
        this.direction = direction;
    }

    public int move() {
        if (direction.isLeft()) {
            return index - 1;
        }
        if (direction.isRight()) {
            return index + 1;
        }
        return index;
    }

    public Point next() {
        return new Point(index + 1, direction.next());
    }

    public Point next(boolean nextRight) {
        return new Point(index + 1, direction.next(nextRight));
    }

    public static Point first(boolean right) {
        return new Point(0, Direction.of(FALSE, right));
    }

    public Point last() {
        return new Point(index + 1, direction.next(FALSE));
    }
}
