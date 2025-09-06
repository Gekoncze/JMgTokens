package cz.mg.token.test;

import cz.mg.annotations.classes.Static;
import cz.mg.annotations.requirement.Mandatory;
import cz.mg.token.Position;

public @Static class PositionFunctions {
    public static boolean equals(@Mandatory Position a, @Mandatory Position b) {
        return a.getClass() == b.getClass()
            && a.getRow() == b.getRow()
            && a.getColumn() == b.getColumn();
    }

    public static @Mandatory String format(@Mandatory Position p) {
        return "(" + p.getRow() + "," + p.getColumn() + ")";
    }
}
