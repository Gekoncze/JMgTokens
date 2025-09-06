package cz.mg.token.test;

import cz.mg.annotations.classes.Service;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.collections.list.List;
import cz.mg.token.Token;
import cz.mg.token.tokens.brackets.CurlyBrackets;
import cz.mg.token.tokens.brackets.RoundBrackets;
import cz.mg.token.tokens.brackets.SquareBrackets;

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
        return new RoundBrackets("", 0, new List<>(tokens));
    }

    public @Mandatory SquareBrackets squareBrackets(Token... tokens) {
        return new SquareBrackets("", 0, new List<>(tokens));
    }

    public @Mandatory CurlyBrackets curlyBrackets(Token... tokens) {
        return new CurlyBrackets("", 0, new List<>(tokens));
    }
}