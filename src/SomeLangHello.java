/*------------------------------------------------------------------------------
// SomeLangHello インプリメント
// Last Modified: 2014/09/19 22:20:29
//-----------------------------------------------------------------------------*/
package org.hilib.script;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class SomeLangHello
{
	public static void main(String[] args) {
		eval("js", "print(\"Hello world\\n\");");
		eval("sisc", "(display \"Hello world\\n\")");
	}

	public static void eval(String engineName, String operators) {
		ScriptEngineManager mngr = new ScriptEngineManager();
		ScriptEngine engine = mngr.getEngineByName(engineName);
		try {
			engine.eval(operators);
		} catch (ScriptException e) {
			System.out.println(e);
		}
	}
}
