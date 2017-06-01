package controller;

public class CommandFactory {
	private CommandFactory(){}
	private static CommandFactory instance = new CommandFactory();
	
	public static CommandFactory newInstance(){
		return instance;
	}
	
	public Command createCommand(String cmd){
		if (cmd.equals("REGFORM")) {
			return new RegFormCommand();
		}
		else if (cmd.equals("CONFIRM")) {
			return new ConfirmCommand();
		}
		else{
			return null;
		}
	}
	
}
