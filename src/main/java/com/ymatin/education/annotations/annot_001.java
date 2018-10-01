package com.ymatin.education.annotations;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class annot_001 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        StringWriter writer = new StringWriter();
        engine.getContext().setWriter(new PrintWriter(writer,true));

    }
}
