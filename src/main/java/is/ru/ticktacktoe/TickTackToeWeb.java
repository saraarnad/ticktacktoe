package is.ru.ticktacktoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TickTackToeWeb implements SparkApplication
{
	//buaa til constructor?
	private TickTackToe game;

	public static void main(String[] args)
	{
		staticFileLocation("/public");
		SparkApplication TickTackToe = new TickTackToeWeb();
		String port = System.getenv("PORT");
		if(port != null)
		{
			setPort(Integer.parseInt(portNumber));
			TickTackToe.init();
		}

		TickTackToe.init();
	}

	//@Override
	public void init()
	{
		if (game == null)
		{
			game = new TickTackToe();
		}
	}
}