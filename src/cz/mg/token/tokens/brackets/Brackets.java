package cz.mg.token.tokens.brackets;

import cz.mg.annotations.classes.Entity;
import cz.mg.annotations.requirement.Required;
import cz.mg.annotations.storage.Commons;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Entity class Brackets extends Token {
    private List<Token> tokens = new List<>();

    public Brackets() {
    }

    public Brackets(String text, int position, List<Token> tokens) {
        super(text, position);
        this.tokens = tokens;
    }

    @Required @Commons
    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}