package sample;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;


public class MoneyManagerControls
{

    public MoneyManagerControls()
    {

    }
    private TableView moneyStuff;
    //Uninitialized menu items
    private Menu mmFileMenu, mmEditMenu, mmHelpMenu;
    private MenuItem saveToDatabase, closeApplication, addPaycheck, manualMoneyTransfer,
            changePercentages, aboutApplication;
    private MenuBar mmMenuBar;


    public MenuBar returnmmMenuBar()
    {
        //For File Menu
        mmFileMenu = new Menu("File");
        saveToDatabase = new MenuItem();
        closeApplication = new MenuItem();
        saveToDatabase.setText("save");
        closeApplication.setText("close");
        closeApplication.setOnAction(e ->
        {
            System.exit(0);
        });
        mmFileMenu.getItems().addAll(saveToDatabase, closeApplication);

        //For Edit Menu
        mmEditMenu = new Menu("Edit");
        addPaycheck = new MenuItem();
        manualMoneyTransfer = new MenuItem();
        changePercentages = new MenuItem();
        addPaycheck.setText("add paycheck");
        manualMoneyTransfer.setText("transfer money");
        changePercentages.setText("change percentages");
        mmEditMenu.getItems().addAll(addPaycheck, manualMoneyTransfer,
                changePercentages);

        //For Help Menu
        mmHelpMenu = new Menu("Help");
        aboutApplication = new MenuItem();
        aboutApplication.setText("info");
        mmHelpMenu.getItems().add(aboutApplication);

        mmMenuBar = new MenuBar();
        mmMenuBar.getMenus().addAll(mmFileMenu, mmEditMenu, mmHelpMenu);

        return mmMenuBar;
    }

    public void setMoneyStuff(TableView moneyStuff)
    {
        this.moneyStuff = moneyStuff;
    }
    public TableView returnMoneyStuff()
    {
        TableView ms = new TableView();
        setMoneyStuff(ms);

        return moneyStuff;
    }
}
