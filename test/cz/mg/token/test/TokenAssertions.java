package cz.mg.token.test;

import cz.mg.annotations.classes.Service;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.annotations.requirement.Optional;
import cz.mg.collections.list.List;
import cz.mg.test.Assertions;
import cz.mg.token.Token;

import java.util.Objects;

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
            .withFormatFunction(this::format)
            .withEqualsFunction(this::equals)
            .isEqualTo(expectation);
    }

    public void assertEquals(@Optional List<Token> expectation, @Optional List<Token> reality) {
        Assertions.assertThatCollection(reality)
            .withFormatFunction(this::format)
            .withEqualsFunction(this::equals)
            .withDetails("[", ",", "]")
            .isEqualTo(expectation);
    }

    public void assertNotEquals(@Optional Token expectation, @Optional Token reality) {
        Assertions.assertThat(reality)
            .withFormatFunction(this::format)
            .withEqualsFunction(this::equals)
            .isNotEqualTo(expectation);
    }

    public void assertNotEquals(@Optional List<Token> expectation, @Optional List<Token> reality) {
        Assertions.assertThatCollection(reality)
            .withFormatFunction(this::format)
            .withEqualsFunction(this::equals)
            .withDetails("[", ",", "]")
            .isNotEqualTo(expectation);
    }

    private String format(@Mandatory Token token) {
        String fullName = token.getClass().getSimpleName();
        String shortName = fullName.substring(0, fullName.lastIndexOf("Token"));
        String text = encode(token.getText());
        return shortName + "('" + text + "'," + token.getPosition() + ")";
    }

    private boolean equals(@Mandatory Token a, @Mandatory Token b) {
        return Objects.equals(a.getClass(), b.getClass())
            && Objects.equals(a.getText(), b.getText())
            && Objects.equals(a.getPosition(), b.getPosition());
    }

    private @Mandatory String encode(@Mandatory String s) {
        return s.replaceAll("\n", "\\n").replaceAll("\t", "\\t");
    }
}
