package cz.mg.token.test;

import cz.mg.annotations.classes.Static;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.token.Token;

import java.util.Objects;

public @Static class TokenFunctions {
    public static boolean equals(@Mandatory Token a, @Mandatory Token b) {
        return Objects.equals(a.getClass(), b.getClass())
            && Objects.equals(a.getText(), b.getText())
            && Objects.equals(a.getPosition(), b.getPosition());
    }

    public static @Mandatory String format(@Mandatory Token token) {
        String fullName = token.getClass().getSimpleName();
        String shortName = fullName.substring(0, fullName.lastIndexOf("Token"));
        return shortName + "('" + encode(token.getText()) + "'," + token.getPosition() + ")";
    }

    private static @Mandatory String encode(@Mandatory String s) {
        return s.replaceAll("\n", "\\n").replaceAll("\t", "\\t");
    }
}
