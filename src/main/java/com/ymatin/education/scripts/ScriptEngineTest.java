package com.ymatin.education.scripts;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

public class ScriptEngineTest {
    public static void main(String[] args) {
        ScriptEngineManager m = new ScriptEngineManager();
        List<ScriptEngineFactory> ef = m.getEngineFactories();

    }
}
