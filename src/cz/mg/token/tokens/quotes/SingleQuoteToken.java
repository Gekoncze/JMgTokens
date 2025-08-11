package cz.mg.token.tokens.quotes;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.QuoteToken;

public @Entity class SingleQuoteToken extends QuoteToken {
    public SingleQuoteToken() {
    }

    public SingleQuoteToken(String text, int position) {
        super(text, position);
    }
}
