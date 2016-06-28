package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;


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

    //Menu bar mutator
    public void setmmMenuBar(MenuBar mmMenuBar)
    {
        this.mmMenuBar = mmMenuBar;
    }
    //Menu mutators
    public void setmmFileMenu(Menu mmFileMenu)
    {
        this.mmFileMenu = mmFileMenu;
    }
    public void setmmEditMenu(Menu mmEditMenu)
    {
        this.mmEditMenu = mmEditMenu;
    }
    public void setmmHelpMenu(Menu mmHelpMenu)
    {
        this.mmHelpMenu = mmHelpMenu;
    }
    //Menu item mutators
    public void setSaveToDatabase(MenuItem saveToDatabase)
    {
        this.saveToDatabase = saveToDatabase;
    }
    public void setCloseApplication(MenuItem closeApplication)
    {
        this.closeApplication = closeApplication;
    }
    public void setAddPaycheck(MenuItem addPaycheck)
    {
        this.addPaycheck = addPaycheck;
    }
    public void setManualMoneyTransfer(MenuItem manualMoneyTransfer)
    {
        this.manualMoneyTransfer = manualMoneyTransfer;
    }
    public void setChangePercentages(MenuItem changePercentages)
    {
        this.changePercentages = changePercentages;
    }
    public void setAboutApplication(MenuItem aboutApplication)
    {
        this.aboutApplication = aboutApplication;
    }

    //Menu bar accessor
    public MenuBar getmmMenuBar()
    {
        //For File Menu
        setmmFileMenu(new Menu("File"));
        setSaveToDatabase(new MenuItem());
        setCloseApplication(new MenuItem());
        getSaveToDatabase().setText("save");
        getCloseApplication().setText("close");
        getCloseApplication().setOnAction(e ->
        {
            System.exit(0);
        });
        getmmFileMenu().getItems().addAll(getSaveToDatabase(), getCloseApplication());

        //For Edit Menu
        setmmEditMenu(new Menu("Edit"));
        setAddPaycheck(new MenuItem());
        setManualMoneyTransfer(new MenuItem());
        setChangePercentages(new MenuItem());
        getAddPaycheck().setText("add paycheck");
        getManualMoneyTransfer().setText("transfer money");
        getChangePercentages().setText("change percentages");
        getChangePercentages().setOnAction( e ->
        {
            newWindowToChangePercentages();
        });
        getmmEditMenu().getItems().addAll(getAddPaycheck(), getManualMoneyTransfer(),
                getChangePercentages());

        //For Help Menu
        setmmHelpMenu(new Menu("Help"));
        setAboutApplication(new MenuItem());
        getAboutApplication().setText("info");
        getmmHelpMenu().getItems().add(getAboutApplication());

        MenuBar bars = new MenuBar();
        bars.getMenus().addAll(getmmFileMenu(), getmmEditMenu(), getmmHelpMenu());
        setmmMenuBar(bars);

        return mmMenuBar;
        }
    //Menu accessors
    public Menu getmmFileMenu()
    {
        return mmFileMenu;
    }
    public Menu getmmEditMenu()
    {
        return mmEditMenu;
    }
    public Menu getmmHelpMenu()
    {
        return mmHelpMenu;
    }
    //Menu item accessors
    public MenuItem getSaveToDatabase()
    {
        return saveToDatabase;
    }
    public MenuItem getCloseApplication()
    {
        return closeApplication;
    }
    public MenuItem getAddPaycheck()
    {
        return addPaycheck;
    }
    public MenuItem getManualMoneyTransfer()
    {
        return manualMoneyTransfer;
    }
    public MenuItem getChangePercentages()
    {
        return changePercentages;
    }
    public MenuItem getAboutApplication()
    {
       return aboutApplication;
    }
    /**
    public MenuBar returnmmMenuBar()
    {
        //For File Menu
        setmmFileMenu(new Menu("File"));
        saveToDatabase = new MenuItem();
        closeApplication = new MenuItem();
        saveToDatabase.setText("save");
        closeApplication.setText("close");
        closeApplication.setOnAction(e ->
        {
            System.exit(0);
        });
        getmmFileMenu().getItems().addAll(saveToDatabase, closeApplication);

        //For Edit Menu
        mmEditMenu = new Menu("Edit");
        addPaycheck = new MenuItem();
        manualMoneyTransfer = new MenuItem();
        changePercentages = new MenuItem();
        addPaycheck.setText("add paycheck");
        manualMoneyTransfer.setText("transfer money");
        changePercentages.setText("change percentages");
        changePercentages.setOnAction( e ->
        {
            newWindowToChangePercentages();
        });
        mmEditMenu.getItems().addAll(addPaycheck, manualMoneyTransfer,
                changePercentages);

        //For Help Menu
        mmHelpMenu = new Menu("Help");
        aboutApplication = new MenuItem();
        aboutApplication.setText("info");
        mmHelpMenu.getItems().add(aboutApplication);

        setmmMenuBar(new MenuBar());
        mmMenuBar.getMenus().addAll(getmmFileMenu(), getmmEditMenu(), getmmHelpMenu());

        return mmMenuBar;
    }
     */
    public void listCurrentPercentages(TextField iPhoneFundPercentage, TextField personalEmergencyFundPercentage,
                                       TextField familyEmergencyFundPercentage, TextField carFundPercentage,
           TextField investingFundPercentage, TextField clothingFundPercentage, TextField supplementFundPercentage,
            TextField chessSetFundPercentage, TextField runningFundPercentage, TextField miscellaneousFundPercentage,
                                       AccountPercentages percentageStorage)
    {
        iPhoneFundPercentage.setText("" + (percentageStorage.getiPhoneBatteryFundPercentage() * 100));
        personalEmergencyFundPercentage.setText("" + (percentageStorage.getPersonalEmergencyFundPercentage() * 100));
        familyEmergencyFundPercentage.setText("" + (percentageStorage.getFamilyEmergencyFundPercentage() * 100));
        carFundPercentage.setText("" + (percentageStorage.getCarFundPercentage() * 100));
        investingFundPercentage.setText("" + (percentageStorage.getInvestingFundPercentage() * 100));
        clothingFundPercentage.setText("" + (percentageStorage.getClothingFundPercentage() * 100));
        supplementFundPercentage.setText("" + (percentageStorage.getSupplementFundPercentage() * 100));
        chessSetFundPercentage.setText("" + (percentageStorage.getChessSetFundPercentage() * 100));
        runningFundPercentage.setText("" + (percentageStorage.getRunningFundPercentage() * 100));
        miscellaneousFundPercentage.setText("" + (percentageStorage.getMiscellaneousFundPercentage() * 100));
    }
    public void setUpdatePercentages(TextField iPhoneFundPercentage, TextField personalEmergencyFundPercentage,
                                     TextField familyEmergencyFundPercentage, TextField carFundPercentage,
                                     TextField investingFundPercentage, TextField clothingFundPercentage,
                                     TextField supplementFundPercentage, TextField chessSetFundPercentage,
                                     TextField runningFundPercentage, TextField miscellaneousFundPercentage,
                                     AccountPercentages percentagesStorage)
    {
        percentagesStorage.setiPhoneBatteryFundPercentage(stringToDouble(iPhoneFundPercentage.getText()));
        percentagesStorage.setPersonalEmergencyFundPercentage(stringToDouble(personalEmergencyFundPercentage.getText()));
        percentagesStorage.setFamilyEmergencyFundPercentage(stringToDouble(familyEmergencyFundPercentage.getText()));
        percentagesStorage.setCarFundPercentage(stringToDouble(carFundPercentage.getText()));
        percentagesStorage.setInvestingFundPercentage(stringToDouble(investingFundPercentage.getText()));
        percentagesStorage.setClothingFundPercentage(stringToDouble(clothingFundPercentage.getText()));
        percentagesStorage.setSupplementFundPercentage(stringToDouble(supplementFundPercentage.getText()));
        percentagesStorage.setChessSetFundPercentage(stringToDouble(chessSetFundPercentage.getText()));
        percentagesStorage.setRunningFundPercentage(stringToDouble(runningFundPercentage.getText()));
        percentagesStorage.setMiscellaneousFundPercentage(stringToDouble(miscellaneousFundPercentage.getText()));
    }
    public void newWindowToChangePercentages() {
        Stage percentageStage = new Stage();
        BorderPane percentageBorderPane = new BorderPane();
        AccountPercentages percentageStorage = new AccountPercentages();


        VBox percentageLabels = new VBox();

        Label iPhoneFundPercentageLabel = new Label();
        iPhoneFundPercentageLabel.setText("iPhone Percentage");
        Label personalEmergencyFundPercentageLabel = new Label();
        personalEmergencyFundPercentageLabel.setText("Personal Emergency Percentage");
        Label familyEmergencyFundPercentageLabel = new Label();
        familyEmergencyFundPercentageLabel.setText("Family Emergency Percentage");
        Label carFundPercentageLabel = new Label("Car Percentage");
        Label investingFundPercentageLabel = new Label("Investing Percentage");
        Label clothingFundPercentageLabel = new Label("Clothing Percentage");
        Label supplementFundPercentageLabel = new Label("Supplement Percentage");
        Label chessSetFundPercentageLabel = new Label("Chess Set Percentage");
        Label runningFundPercentageLabel = new Label("Running Percentage");
        Label miscellaneousFundPercentageLabel = new Label("Miscellaneous Percentage");

        percentageLabels.getChildren().addAll(iPhoneFundPercentageLabel, personalEmergencyFundPercentageLabel,
                familyEmergencyFundPercentageLabel, carFundPercentageLabel, investingFundPercentageLabel,
                clothingFundPercentageLabel, supplementFundPercentageLabel, chessSetFundPercentageLabel,
                runningFundPercentageLabel, miscellaneousFundPercentageLabel);
        percentageLabels.setPadding(new Insets(10, 10, 10, 10));
        percentageLabels.setSpacing(20);

        VBox percentageTextFields = new VBox();

        TextField iPhoneFundPercentageTextField = new TextField();
        iPhoneFundPercentageTextField.setPromptText("Enter Percentage");
        TextField personalEmergencyFundPercentageTextField = new TextField();
        personalEmergencyFundPercentageTextField.setPromptText("Enter Percentage");
        TextField familyEmergencyFundPercentageTextField = new TextField();
        familyEmergencyFundPercentageTextField.setPromptText("Enter Percentage");
        TextField carFundPercentageTextField = new TextField();
        carFundPercentageTextField.setPromptText("Enter Percentage");
        TextField investingFundPercentageTextField = new TextField();
        investingFundPercentageTextField.setPromptText("Enter Percentage");
        TextField clothingFundPercentageTextField = new TextField();
        clothingFundPercentageTextField.setPromptText("Enter Percentage");
        TextField supplementFundPercentageTextField = new TextField();
        supplementFundPercentageTextField.setPromptText("Enter Percentage");
        TextField chessSetFundPercentageTextField = new TextField();
        chessSetFundPercentageTextField.setPromptText("Enter Percentage");
        TextField runningFundPercentageTextField = new TextField();
        runningFundPercentageTextField.setPromptText("Enter Percentage");
        TextField miscellaneousFundPercentageTextField = new TextField();
        miscellaneousFundPercentageTextField.setPromptText("Enter Percentage");

        percentageTextFields.getChildren().addAll(iPhoneFundPercentageTextField, personalEmergencyFundPercentageTextField,
                familyEmergencyFundPercentageTextField, carFundPercentageTextField, investingFundPercentageTextField,
                clothingFundPercentageTextField, supplementFundPercentageTextField, chessSetFundPercentageTextField,
                runningFundPercentageTextField, miscellaneousFundPercentageTextField);
        percentageTextFields.setPadding(new Insets(10, 10, 10, 10));
        percentageTextFields.setSpacing(10);


        Menu percentageEditMenu = new Menu("Edit");
        MenuItem currentPercentages, updatePercentages, closePercentages;

        currentPercentages = new MenuItem("Load Current Percentages");
        currentPercentages.setOnAction(e ->
        {
            listCurrentPercentages(iPhoneFundPercentageTextField, personalEmergencyFundPercentageTextField,
                    familyEmergencyFundPercentageTextField, carFundPercentageTextField, investingFundPercentageTextField,
                    clothingFundPercentageTextField, supplementFundPercentageTextField, chessSetFundPercentageTextField,
                    runningFundPercentageTextField, miscellaneousFundPercentageTextField, percentageStorage);
        });
        updatePercentages = new MenuItem("Update Percentages");
        updatePercentages.setOnAction(e ->
        {
            setUpdatePercentages(iPhoneFundPercentageTextField, personalEmergencyFundPercentageTextField,
                    familyEmergencyFundPercentageTextField, carFundPercentageTextField, investingFundPercentageTextField,
                    clothingFundPercentageTextField, supplementFundPercentageTextField, chessSetFundPercentageTextField,
                    runningFundPercentageTextField, miscellaneousFundPercentageTextField, percentageStorage);
        });
        closePercentages = new MenuItem("Close Percentages Window");
        closePercentages.setOnAction(e ->
        {
            percentageStage.close();
        });

        percentageEditMenu.getItems().addAll(currentPercentages, updatePercentages, closePercentages);

        VBox percentageSign = new VBox();
        for (int i = 0; i < 10; i++)
        {
            percentageSign.getChildren().add(i, new Label("%"));
        }
        percentageSign.setSpacing(21);
        percentageSign.setPadding(new Insets(10, 10, 10, 10));

        percentageBorderPane.setTop(new MenuBar(percentageEditMenu));
        percentageBorderPane.setLeft(percentageLabels);
        percentageBorderPane.setCenter(percentageTextFields);
        percentageBorderPane.setRight(percentageSign);


        Scene percentageScene = new Scene(percentageBorderPane);

        percentageStage.setMinHeight(400);
        percentageStage.setMinWidth(300);
        percentageStage.setScene(percentageScene);
        percentageStage.show();
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
    public double stringToDouble(String percentageString)
    {
        return (Double.parseDouble(percentageString) / 100);
    }
}
