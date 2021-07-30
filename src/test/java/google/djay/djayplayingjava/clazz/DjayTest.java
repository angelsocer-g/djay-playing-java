package google.djay.djayplayingjava.clazz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DjayTest {

    @Test
    @DisplayName("생성자 테스트")
    void constructorTest(){
        Djay djay = new Djay();
        Assertions.assertThat(djay).isNotNull();

        djay = new Djay("정주", "개발자");
        Assertions.assertThat(djay).isNotNull();
        Assertions.assertThat(djay.getName()).isNotNull();
        Assertions.assertThat(djay.getJob()).isNotNull();
    }

}