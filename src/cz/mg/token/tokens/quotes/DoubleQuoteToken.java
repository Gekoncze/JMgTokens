package cz.mg.token.tokens.quotes;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.QuoteToken;

public @Entity class DoubleQuoteToken extends QuoteToken {
    public DoubleQuoteToken() {
    }

    public DoubleQuoteToken(String text, int position) {
        super(text, position);
    }
}
