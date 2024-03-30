package cz.mg.token.tokens;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.Token;

public @Entity class CommentToken extends Token {
    public CommentToken() {
    }

    public CommentToken(String text, int position) {
        super(text, position);
    }
}
