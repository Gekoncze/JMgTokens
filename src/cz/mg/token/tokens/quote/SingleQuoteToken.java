package cz.mg.token.tokens.quote;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.QuoteToken;

public @Entity class SingleQuoteToken extends QuoteToken {
    public SingleQuoteToken() {
    }

    public SingleQuoteToken(String text, int position) {
        super(text, position);
    }
}
