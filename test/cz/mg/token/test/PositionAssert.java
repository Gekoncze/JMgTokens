package cz.mg.token.test;

import cz.mg.annotations.classes.Static;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.test.Assertions;
import cz.mg.token.Position;

public @Static class PositionAssert {
    public static void assertEquals(@Mandatory Position expectation, @Mandatory Position reality) {
        Assertions.assertThat(reality)
            .withEqualsFunction(PositionFunctions::equals)
            .withFormatFunction(PositionFunctions::format)
            .isEqualTo(expectation);
    }
}
