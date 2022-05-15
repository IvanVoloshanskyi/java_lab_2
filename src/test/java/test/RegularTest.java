package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab7.Regular;

class RegularTest {
    public Regular r1;

    @BeforeEach
    void setUp() throws Exception {
        r1= new Regular();
    }

    @Test
    void testFindRegExprInText() {
        r1.findRegExprInText();
    }

}
