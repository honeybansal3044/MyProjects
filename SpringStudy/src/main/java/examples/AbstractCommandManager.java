package examples;

public abstract class AbstractCommandManager {
	
	protected void procees() {
		Command command = createCommand();
		command.print();
		System.out.println(command.toString());
	}

	protected abstract MyCommand createCommand();
}
