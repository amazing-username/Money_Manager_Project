package sample;

/*
 * Programmer: Kun Deng
 * Date created: June 14, 2016
 * 
 * Purpose: To create an application to manage money
 * in different psuedo-accounts that are actually from
 * a single account. Lets say I have a checking account
 * with $500,000 and I have ten accounts. To keep a 
 * record of the transactions from all those accounts
 * I have to log everything down but with an application,
 * I just have to add data and the data can be saved to
 * prevent data lost, opposed to writing down to a ledger.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application
{
	public Main()
	{
	
	}

	public static Scene scn;

	public static void setScn(BorderPane bp)
	{
		scn = new Scene(bp);
	}

	public static Scene getScn()
	{
		return scn;
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		MoneyManagerControls controls = new MoneyManagerControls();

		System.out.println("Before");

		controls.loginWindowSetup(primaryStage);
		
		System.out.println("After");


		
		
		//setScn(controls.getbdp());
		//controls.getbdp().setTop(controls.getmmMenuBar());
		//controls.getbdp().setCenter(controls.bpCenterSetup());
		//controls.setMoneyStuff();
		//controls.getbdp().setBottom(controls.getMoneyStuff());

	}
	public static void main(String[] args)
	{
		launch(args);
	}	
}
