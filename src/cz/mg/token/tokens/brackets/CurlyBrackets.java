package cz.mg.token.tokens.brackets;

import cz.mg.annotations.classes.Entity;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class CurlyBrackets extends Brackets {
    public CurlyBrackets() {
    }

    public CurlyBrackets(String text, int position, List<Token> tokens) {
        super(text, position, tokens);
    }
}
