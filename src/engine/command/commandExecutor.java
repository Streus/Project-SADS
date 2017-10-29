package engine.command;

public class commandExecutor {

	public static void main(String[] args) {
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand("101110101011101*");
		
		CommandResponse smResp = smCommand.execute();
		
		System.out.println(smResp.returnVal);
		

	}

}
