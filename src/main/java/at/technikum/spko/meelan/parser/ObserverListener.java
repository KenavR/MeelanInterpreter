package at.technikum.spko.meelan.parser;

import at.technikum.spko.meelan.antlr.MeelanParser;

import java.util.List;

public class ObserverListener {
    public final String varName;
    public final Integer lastValue;
    public final List<MeelanParser.StatementContext> observers;

    public ObserverListener(String varName, Integer lastValue, List<MeelanParser.StatementContext> observers) {
        this.varName = varName;
        this.lastValue = lastValue;
        this.observers = observers;
    }
}
