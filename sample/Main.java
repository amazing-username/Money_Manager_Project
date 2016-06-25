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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;


public class Main extends Application
{
	public Main()
	{
	
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		String[] accounts = {"iPhone Fund", "Personal Emergency Fund",
			"Family Emergency Fund", "Car Fund", "Investing Fund",
			"Clothing Fund", "Supplement Fund", "Running Fund",
			"Miscellaneous Fund"};

		TableView tblView = new TableView();

		ComboBox cmb = new ComboBox();
		cmb.getItems().addAll(accounts);

		Button pullUpAccounts = new Button();

		BorderPane bp = new BorderPane();
		bp.setBottom(tblView);
		bp.setCenter(cmb);

		Scene scn = new Scene(bp);

		primaryStage.setHeight(900);
		primaryStage.setWidth(800);
		primaryStage.setTitle("MM");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}	
}
