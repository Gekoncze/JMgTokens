package cz.mg.token.tokens;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.Token;

public @Entity class SymbolToken extends Token {
    public SymbolToken() {
    }

    public SymbolToken(String text, int position) {
        super(text, position);
    }
}
