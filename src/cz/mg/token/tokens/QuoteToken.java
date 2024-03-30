package cz.mg.token.tokens;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.Token;

public @Entity class QuoteToken extends Token {
    public QuoteToken() {
    }

    public QuoteToken(String text, int position) {
        super(text, position);
    }
}
