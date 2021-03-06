package forensic.main;

public abstract class Cmd {
	private String command;
	private String instruction;
	String[] param;
	
	public Cmd() { }
	
	public String getCommand()	{
		return this.command;
	}

	public void setCommand(String command)	{
		this.command = command;
	}

	public String getInstruction()	{
		return this.instruction;
	}

	public void setInstruction(String instruction)	{
		this.instruction = instruction;
	}
	
	public void setParam(String[] param)	{
		this.param = param;
	}
	
	public abstract void doing();

	@Override
	public String toString()	{
		return this.command + " : " + this.instruction;
	}
}
