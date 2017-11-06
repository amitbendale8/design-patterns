package commandpattern;

public class App {

	public static void main(String[] args) {
		Switcher switcher = new Switcher();
		
		Light light = new Light();
		
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);
		
		switcher.addCommands(turnOffCommand);
		switcher.addCommands(turnOnCommand);
		switcher.executeCommands();
				
	}

}
