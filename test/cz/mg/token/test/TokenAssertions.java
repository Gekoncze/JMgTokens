package cz.mg.token.test;

import cz.mg.annotations.classes.Service;
import cz.mg.annotations.requirement.Optional;
import cz.mg.collections.list.List;
import cz.mg.test.Assertions;
import cz.mg.token.Token;

public @Service class TokenAssertions {
    private static volatile @Service TokenAssertions instance;

    public static @Service TokenAssertions getInstance() {
        if (instance == null) {
            synchronized (Service.class) {
                if (instance == null) {
                    instance = new TokenAssertions();
                }
            }
        }
        return instance;
    }

    private TokenAssertions() {
    }

    public void assertEquals(@Optional Token expectation, @Optional Token reality) {
        Assertions.assertThat(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .isEqualTo(expectation);
    }

    public void assertEquals(@Optional List<Token> expectation, @Optional List<Token> reality) {
        Assertions.assertThatCollection(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .withDetails("[", ",", "]")
            .isEqualTo(expectation);
    }

    public void assertNotEquals(@Optional Token expectation, @Optional Token reality) {
        Assertions.assertThat(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .isNotEqualTo(expectation);
    }

    public void assertNotEquals(@Optional List<Token> expectation, @Optional List<Token> reality) {
        Assertions.assertThatCollection(reality)
            .withFormatFunction(TokenFunctions::format)
            .withEqualsFunction(TokenFunctions::equals)
            .withDetails("[", ",", "]")
            .isNotEqualTo(expectation);
    }
}
