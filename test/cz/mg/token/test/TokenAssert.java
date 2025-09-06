package cz.mg.token.test;

import cz.mg.annotations.classes.Static;
import cz.mg.annotations.requirement.Optional;
import cz.mg.test.Assertions;
import cz.mg.token.Token;

public @Static class TokenAssert {
    public static void assertEquals(@Optional Token expectation, @Optional Token reality) {
        Assertions.assertThat(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .isEqualTo(expectation);
    }

    public static void assertEquals(@Optional Iterable<Token> expectation, @Optional Iterable<Token> reality) {
        Assertions.assertThatCollection(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .withDetails("[", ",", "]")
            .isEqualTo(expectation);
    }

    public static void assertNotEquals(@Optional Token expectation, @Optional Token reality) {
        Assertions.assertThat(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .isNotEqualTo(expectation);
    }

    public static void assertNotEquals(@Optional Iterable<Token> expectation, @Optional Iterable<Token> reality) {
        Assertions.assertThatCollection(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .withDetails("[", ",", "]")
            .isNotEqualTo(expectation);
    }
}
