package cz.mg.token.tokens.comments;

import cz.mg.annotations.classes.Entity;
import cz.mg.token.tokens.CommentToken;

public @Entity class SingleLineCommentToken extends CommentToken {
    public SingleLineCommentToken() {
    }

    public SingleLineCommentToken(String text, int position) {
        super(text, position);
    }
}
