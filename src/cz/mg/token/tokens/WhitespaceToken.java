package cz.mg.token.tokens;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.Token;

public @Entity class WhitespaceToken extends Token {
    public WhitespaceToken() {
    }

    public WhitespaceToken(String text, int position) {
        super(text, position);
    }
}
