package cz.mg.token.tokens;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.Token;

public @Entity class NumberToken extends Token {
    public NumberToken() {
    }

    public NumberToken(String text, int position) {
        super(text, position);
    }
}
