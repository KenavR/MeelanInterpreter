package at.technikum.spko.meelan.parser;

import at.technikum.spko.meelan.antlr.MeelanParser;

import java.util.List;

public class FunctionState {
    public final String name;
    public final List<String> arguments;
    public final MeelanParser.StatementContext statement;

    public FunctionState(String name, List<String> args, MeelanParser.StatementContext statement) {
        this.name = name;
        this.arguments = args;
        this.statement = statement;
    }
}
