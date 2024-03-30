package cz.mg.token.tokens.brackets;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Shared;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class Brackets extends Token {
    private List<Token> tokens = new List<>();

    public Brackets() {
    }

    @Required @Shared
    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}