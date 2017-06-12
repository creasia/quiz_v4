package controller;

public class CommandFactory {
	private CommandFactory(){}
	private static CommandFactory instance = new CommandFactory();
	
	public static CommandFactory newInstance(){
		return instance;
	}
	
	public Command createCommand(String cmd){
		if (cmd.equals("QUIZ_GET")) {
			return new QuizgetCommand();
		}else if (cmd.equals("QUIZ_CHECK")) {
			return new QuziCheckCommand();
		}
		else if (cmd.equals("QUIZ_PUT")) {
		}else if(cmd.equals("QUIZ_RESULT")){
		}
		else{
		}
		return null;
	}	
}