package engine.command;

public class commandExecutor {

	public static void main(String[] args) {
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand("101110101011101*");
		
		System.out.println(smCommand.execute()); 

	}

}
