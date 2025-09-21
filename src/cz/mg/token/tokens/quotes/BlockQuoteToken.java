package cz.mg.token.tokens.quotes;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.QuoteToken;

public @Entity class BlockQuoteToken extends QuoteToken {
    public BlockQuoteToken() {
    }

    public BlockQuoteToken(String text, int position) {
        super(text, position);
    }
}
