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

        mmMenuBar = new MenuBar();
        mmMenuBar.getMenus().addAll(mmFileMenu, mmEditMenu, mmHelpMenu);

        return mmMenuBar;
    }
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

        //Stage percentageStage = new Stage();
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
}
