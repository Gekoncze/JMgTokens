package cz.mg.token.tokens;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.Token;

public @Entity class WordToken extends Token {
    public WordToken() {
    }

    public WordToken(String text, int position) {
        super(text, position);
    }
}
