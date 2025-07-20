package cz.mg.token.test;

import cz.mg.annotations.classes.Service;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.token.tokens.brackets.Brackets;
import cz.mg.token.tokens.brackets.CurlyBrackets;
import cz.mg.token.tokens.brackets.RoundBrackets;
import cz.mg.token.tokens.brackets.SquareBrackets;
import cz.mg.collections.list.List;
import cz.mg.token.Token;

public @Service class BracketFactory {
    private static volatile @Service BracketFactory instance;

    public static @Service BracketFactory getInstance() {
        if (instance == null) {
            synchronized (Service.class) {
                if (instance == null) {
                    instance = new BracketFactory();
                }
            }
        }
        return instance;
    }

    private BracketFactory() {
    }

    public @Mandatory RoundBrackets roundBrackets(Token... tokens) {
        return brackets(RoundBrackets::new, tokens);
    }

    public @Mandatory SquareBrackets squareBrackets(Token... tokens) {
        return brackets(SquareBrackets::new, tokens);
    }

    public @Mandatory CurlyBrackets curlyBrackets(Token... tokens) {
        return brackets(CurlyBrackets::new, tokens);
    }

    private <B extends Brackets> @Mandatory B brackets(Factory<B> factory, Token... tokens) {
        B brackets = factory.create();
        brackets.setTokens(new List<>(tokens));
        brackets.setText("");
        brackets.setPosition(0);
        return brackets;
    }

    private interface Factory<B extends Brackets> {
        B create();
    }
}