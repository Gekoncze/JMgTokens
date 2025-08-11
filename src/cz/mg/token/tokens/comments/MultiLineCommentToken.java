package cz.mg.token.tokens.comments;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.CommentToken;

public @Entity class MultiLineCommentToken extends CommentToken {
    public MultiLineCommentToken() {
    }

    public MultiLineCommentToken(String text, int position) {
        super(text, position);
    }
}
