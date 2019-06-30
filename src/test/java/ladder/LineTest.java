package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    @DisplayName("주어진 길이로 Line 인스턴스 생성")
    void constructor() {
        int lineLength = 5;
        Line line = new Line(lineLength);
        assertThat(line.getLength()).isEqualTo(lineLength);
    }
}
