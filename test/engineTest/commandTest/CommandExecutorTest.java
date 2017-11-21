package engineTest.commandTest;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import engine.command.commandExecutor;
import grammar.CommandObject;

public class CommandExecutorTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Rule
    public ExpectedException thrown = ExpectedException.none();

	
	@Test
    public void throwsExceptionWithSpecificType() {
        thrown.expect(EmptyStackException.class);
        Stack<CommandObject> ExceptionStack = new Stack<CommandObject>();
        commandExecutor.executeStack(ExceptionStack);
    }

}
