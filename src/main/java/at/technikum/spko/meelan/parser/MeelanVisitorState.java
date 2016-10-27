package at.technikum.spko.meelan.parser;

import java.util.HashMap;
import java.util.Map;

public class MeelanVisitorState {
    public final Map<String, Integer> variables = new HashMap<>();
    public final Map<String, FunctionState> functions = new HashMap<>();
    public final Map<String, ObserverListener> observers = new HashMap<>();
}
