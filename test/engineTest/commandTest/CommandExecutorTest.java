package engineTest.commandTest;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import engine.command.commandExecutor;
import grammar.CommandObject;

public class CommandExecutorTest {

	@Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void throwsNothing() {
        // no exception expected, none thrown: passes.
    }

    @Test
    public void throwsExceptionWithSpecificType() {
        thrown.expect(EmptyStackException.class);
        Stack<CommandObject> ExceptionStack = new Stack<CommandObject>();
        commandExecutor.executeStack(ExceptionStack);
    }
	
	
}
