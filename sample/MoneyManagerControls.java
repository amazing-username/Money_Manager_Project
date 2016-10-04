package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MoneyManagerControls
{

    public MoneyManagerControls()
    {

    }
    PaycheckAndDeductions paycheckStuff = new PaycheckAndDeductions();
    BorderPane bdp = new BorderPane();
    private Button checkButton;
    private ComboBox accountDropDown;
    //Uninitialized menu items
    private Menu mmFileMenu, mmEditMenu, mmHelpMenu;
    private MenuBar mmMenuBar;
    private MenuItem closeApplication, addPaycheck, manualMoneyTransfer,
            changePercentages, aboutApplication;

    private Label iPhoneFundPercentageLabel, personalEmergencyFundPercentageLabel,
    familyEmergencyFundPercentageLabel, carFundPercentageLabel, investingFundPercentageLabel,
    clothingFundPercentageLabel, supplementFundPercentageLabel, chessSetFundPercentageLabel,
    runningFundPercentageLabel, miscellaneousFundPercentageLabel;
    private TableView moneyStuff;
    private TextField iPhoneFundPercentageTextField, personalEmergencyFundPercentageTextField,
    familyEmergencyFundPercentageTextField, carFundPercentageTextField, investingFundPercentageTextField,
    clothingFundPercentageTextField, supplementFundPercentageTextField, chessSetFundPercentageTextField,
    runningFundPercentageTextField, miscellaneousFundPercentageTextField;
    private String accountList[];

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
    //Label mutators
    public void setiPhoneFundPercentageLabel(Label iPhoneFundPercentageLabel)
    {
        this.iPhoneFundPercentageLabel = iPhoneFundPercentageLabel;
    }
    public void setPersonalEmergencyFundPercentageLabel(Label personalEmergencyFundPercentageLabel)
    {
        this.personalEmergencyFundPercentageLabel = personalEmergencyFundPercentageLabel;
    }
    public void setFamilyEmergencyFundPercentageLabel(Label familyEmergencyFundPercentageLabel)
    {
        this.familyEmergencyFundPercentageLabel = familyEmergencyFundPercentageLabel;
    }
    public void setCarFundPercentageLabel(Label carFundPercentageLabel)
    {
        this.carFundPercentageLabel = carFundPercentageLabel;
    }
    public void setInvestingFundPercentageLabel(Label investingFundPercentageLabel)
    {
        this.investingFundPercentageLabel = investingFundPercentageLabel;
    }
    public void setClothingFundPercentageLabel(Label clothingFundPercentageLabel)
    {
        this.clothingFundPercentageLabel = clothingFundPercentageLabel;
    }
    public void setSupplementFundPercentageLabel(Label supplementFundPercentageLabel)
    {
        this.supplementFundPercentageLabel = supplementFundPercentageLabel;
    }
    public void setChessSetFundPercentageLabel(Label chessSetFundPercentageLabel)
    {
        this.chessSetFundPercentageLabel = chessSetFundPercentageLabel;
    }
    public void setRunningFundPercentageLabel(Label runningFundPercentageLabel)
    {
        this.runningFundPercentageLabel = runningFundPercentageLabel;
    }
    public void setMiscellaneousFundPercentageLabel(Label miscellaneousFundPercentageLabel)
    {
        this.miscellaneousFundPercentageLabel = miscellaneousFundPercentageLabel;
    }
    //Text Field mutators
    public void setiPhoneFundPercentageTextField(TextField iPhoneFundPercentageTextField)
    {
        this.iPhoneFundPercentageTextField = iPhoneFundPercentageTextField;
    }
    public void setPersonalEmergencyFundPercentageTextField(TextField personalEmergencyFundPercentageTextField)
    {
        this.personalEmergencyFundPercentageTextField = personalEmergencyFundPercentageTextField;
    }
    public void setFamilyEmergencyFundPercentageTextField(TextField familyEmergencyFundPercentageTextField)
    {
        this.familyEmergencyFundPercentageTextField = familyEmergencyFundPercentageTextField;
    }
    public void setCarFundPercentageTextField(TextField carFundPercentageTextField)
    {
        this.carFundPercentageTextField = carFundPercentageTextField;
    }
    public void setInvestingFundPercentageTextField(TextField investingFundPercentageTextField)
    {
        this.investingFundPercentageTextField = investingFundPercentageTextField;
    }
    public void setClothingFundPercentageTextField(TextField clothingFundPercentageTextField)
    {
        this.clothingFundPercentageTextField = clothingFundPercentageTextField;
    }
    public void setSupplementFundPercentageTextField(TextField supplementFundPercentageTextField)
    {
        this.supplementFundPercentageTextField = supplementFundPercentageTextField;
    }
    public void setChessSetFundPercentageTextField(TextField chessSetFundPercentageTextField)
    {
        this.chessSetFundPercentageTextField = chessSetFundPercentageTextField;
    }
    public void setRunningFundPercentageTextField(TextField runningFundPercentageTextField)
    {
        this.runningFundPercentageTextField = runningFundPercentageTextField;
    }
    public void setMiscellaneousFundPercentageTextField(TextField miscellaneousFundPercentageTextField)
    {
        this.miscellaneousFundPercentageTextField = miscellaneousFundPercentageTextField;
    }
    public void setAccountDropDown(ComboBox accountDropDown)
    {
        this.accountDropDown = accountDropDown;
    }
    public void setCheckButton(Button checkButton)
    {
        this.checkButton = checkButton;
    }
    public void setAccountList(List list)
    {
        Iterator it = list.iterator();
        this.accountList = new String[list.size()];
        int i = 0;
        while (it.hasNext())
        {
            this.accountList[i] = (String) it.next();
            i++;
        }
    }

    //Menu bar accessor
    public MenuBar getmmMenuBar() throws SQLException
    {
        //For File Menu
        setmmFileMenu(new Menu("File"));
        setCloseApplication(new MenuItem());
        getCloseApplication().setText("close");
        getCloseApplication().setOnAction(e ->
        {
            System.exit(0);
        });
        getmmFileMenu().getItems().add(getCloseApplication());

        //For Edit Menu
        setmmEditMenu(new Menu("Edit"));
        setAddPaycheck(new MenuItem());
        setManualMoneyTransfer(new MenuItem());
        setChangePercentages(new MenuItem());
        getAddPaycheck().setText("add paycheck");
        getAddPaycheck().setOnAction(e ->
        {

                newWindowToAddPaycheck();

        });
        getManualMoneyTransfer().setText("transfer money");
        getManualMoneyTransfer().setOnAction( e ->
        {
            System.out.println("Work In Progress...");
        });
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
    public BorderPane getbdp()
    {
        return bdp;
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
    //Label Accessors
    public Label getiPhoneFundPercentageLabel()
    {
        return iPhoneFundPercentageLabel;
    }
    public Label getPersonalEmergencyFundPercentageLabel()
    {
        return personalEmergencyFundPercentageLabel;
    }
    public Label getFamilyEmergencyFundPercentageLabel()
    {
        return familyEmergencyFundPercentageLabel;
    }
    public Label getCarFundPercentageLabel()
    {
        return carFundPercentageLabel;
    }
    public Label getInvestingFundPercentageLabel()
    {
        return investingFundPercentageLabel;
    }
    public Label getClothingFundPercentageLabel()
    {
        return clothingFundPercentageLabel;
    }
    public Label getSupplementFundPercentageLabel()
    {
        return supplementFundPercentageLabel;
    }
    public Label getChessSetFundPercentageLabel() {
        return chessSetFundPercentageLabel;
    }
    public Label getRunningFundPercentageLabel()
    {
        return runningFundPercentageLabel;
    }
    public Label getMiscellaneousFundPercentageLabel()
    {
        return miscellaneousFundPercentageLabel;
    }
    //Text Field accessors
    public TextField getiPhoneFundPercentageTextField()
    {
        return iPhoneFundPercentageTextField;
    }
    public TextField getPersonalEmergencyFundPercentageTextField()
    {
        return personalEmergencyFundPercentageTextField;
    }
    public TextField getFamilyEmergencyFundPercentageTextField()
    {
        return familyEmergencyFundPercentageTextField;
    }
    public TextField getCarFundPercentageTextField()
    {
        return carFundPercentageTextField;
    }
    public TextField getInvestingFundPercentageTextField()
    {
        return investingFundPercentageTextField;
    }
    public TextField getClothingFundPercentageTextField()
    {
        return clothingFundPercentageTextField;
    }
    public TextField getSupplementFundPercentageTextField()
    {
        return supplementFundPercentageTextField;
    }
    public TextField getChessSetFundPercentageTextField()
    {
        return chessSetFundPercentageTextField;
    }
    public TextField getRunningFundPercentageTextField()
    {
        return runningFundPercentageTextField;
    }
    public TextField getMiscellaneousFundPercentageTextField()
    {
        return miscellaneousFundPercentageTextField;
    }
    public Button getCheckButton()
    {
        return checkButton;
    }
    public ComboBox getAccountDropDown()
    {
        return accountDropDown;
    }
    public String[] getAccountList()
    {
        return accountList;
    }


    /*
     * Need to figure out a way that when the button is pressed it will take the selected
     * text from the Combo Box - which is not in the same format as the tables in the
     * database - and grab the corressponding table in the database and display the
     * transaction. What that means is I should be able to effortlessly select a text
     * from the drop-down box, press the button and the contents of the table will be
     * displayed from the database to the table view and table columns.
     *
     * I might run into issues such as missing table columns, logical errors, etc.
     */


    public HBox comboBoxAndButton()
    {
        //AccountData ad = new AccountData();
        HBox topOfCenterThis = new HBox();
        //ad.setComboColumData();
        DatabaseConnection dc;

        try{
        dc = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");

        dc.getAccountList();
        setAccountList(dc.getAccountListPost());
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }

        setAccountDropDown(new ComboBox());
        getAccountDropDown().getItems().addAll(getAccountList());
        setCheckButton(new Button("^"));
        getCheckButton().setOnAction(e ->
        {
            //AccountData junkInTheTrunk = new AccountData();
           // junkInTheTrunk.setComboColumData();

            DatabaseConnection dbsql;

            try {
                dbsql = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");

                //String key = (String) getAccountDropDown().getValue();
                //String value = junkInTheTrunk.getComboColumData().get(key);
                String value = (String) getAccountDropDown().getValue() + "Account";
                //System.out.println(value);


                dbsql.getAccountList();

                dbsql.setAccount( value  );

                getMoneyStuff().getItems().clear();
                getMoneyStuff().getItems().addAll(dbsql.getAccountInfo());
                getbdp().setBottom(getMoneyStuff());

            }
            catch (SQLException s)
            {
                s.printStackTrace();
            }

        });

        topOfCenterThis.setSpacing(20);
        getAccountDropDown().setMinSize(650, 20);
        topOfCenterThis.getChildren().addAll(getAccountDropDown(), getCheckButton());

        return topOfCenterThis;
    }

    public VBox bpCenterSetup()
    {
        VBox centerThis = new VBox();

        centerThis.getChildren().add(comboBoxAndButton());

        centerThis.setSpacing(20);
        centerThis.setPadding(new Insets(200,50,200,50));

        return centerThis;
    }
    public void listCurrentPercentages(AccountPercentages percentageStorage)
    {

    }
    public void setUpdatePercentages(AccountPercentages percentagesStorage)
    {

    }
    public void newWindowToChangePercentages()
    {
        Stage percentageStage = new Stage();
        BorderPane percentageBorderPane = new BorderPane();
        AccountPercentages percentageStorage = new AccountPercentages();

        ComboBox cmbList = new ComboBox();
        Button listPercent = new Button();
        Button updatePercent = new Button();
        TextField displayPercent = new TextField();
        displayPercent.setPromptText("66.6%");

        cmbList.getItems().addAll(getAccountList());


        HBox percentageGroupOne = new HBox();

        setiPhoneFundPercentageLabel(new Label("iPhone Percentage"));
        setPersonalEmergencyFundPercentageLabel(new Label("Personal Emergency Percentage"));
        setFamilyEmergencyFundPercentageLabel(new Label("Family Emergency Percentage"));
        setCarFundPercentageLabel(new Label("Car Percentage"));
        setInvestingFundPercentageLabel(new Label("Investing Percentage"));
        setClothingFundPercentageLabel(new Label("Clothing Percentage"));
        setSupplementFundPercentageLabel(new Label("Supplement Percentage"));
        setChessSetFundPercentageLabel(new Label("Chess Set Percentage"));
        setRunningFundPercentageLabel(new Label("Running Percentage"));
        setMiscellaneousFundPercentageLabel(new Label("Miscellaneous Percentage"));

        /**
        percentageLabels.getChildren().addAll(getiPhoneFundPercentageLabel(), getPersonalEmergencyFundPercentageLabel(),
                getFamilyEmergencyFundPercentageLabel(), getCarFundPercentageLabel(), getInvestingFundPercentageLabel(),
                getClothingFundPercentageLabel(), getSupplementFundPercentageLabel(), getChessSetFundPercentageLabel(),
                getRunningFundPercentageLabel(), getMiscellaneousFundPercentageLabel());
        */
        percentageGroupOne.getChildren().addAll(cmbList, listPercent);
        percentageGroupOne.setPadding(new Insets(10, 10, 10, 10));
        percentageGroupOne.setSpacing(20);

        HBox percentageGroupTwo = new HBox();

        setiPhoneFundPercentageTextField(new TextField());
        getiPhoneFundPercentageTextField().setPromptText("Enter Percentage");
        setPersonalEmergencyFundPercentageTextField(new TextField());
        getPersonalEmergencyFundPercentageTextField().setPromptText("Enter Percentage");
        setFamilyEmergencyFundPercentageTextField(new TextField());
        getFamilyEmergencyFundPercentageTextField().setPromptText("Enter Percentage");
        setCarFundPercentageTextField(new TextField());
        getCarFundPercentageTextField().setPromptText("Enter Percentage");
        setInvestingFundPercentageTextField(new TextField());
        getInvestingFundPercentageTextField().setPromptText("Enter Percentage");
        setClothingFundPercentageTextField(new TextField());
        getClothingFundPercentageTextField().setPromptText("Enter Percentage");
        setSupplementFundPercentageTextField(new TextField());
        getSupplementFundPercentageTextField().setPromptText("Enter Percentage");
        setChessSetFundPercentageTextField(new TextField());
        getChessSetFundPercentageTextField().setPromptText("Enter Percentage");
        setRunningFundPercentageTextField(new TextField());
        getRunningFundPercentageTextField().setPromptText("Enter Percentage");
        setMiscellaneousFundPercentageTextField(new TextField());
        getMiscellaneousFundPercentageTextField().setPromptText("Enter Percentage");

        /**
        percentageTextFields.getChildren().addAll(getiPhoneFundPercentageTextField(), getPersonalEmergencyFundPercentageTextField(),
                getFamilyEmergencyFundPercentageTextField(), getCarFundPercentageTextField(), getInvestingFundPercentageTextField(),
                getClothingFundPercentageTextField(), getSupplementFundPercentageTextField(), getChessSetFundPercentageTextField(),
                getRunningFundPercentageTextField(), getMiscellaneousFundPercentageTextField());
        percentageTextFields.setPadding(new Insets(10, 10, 10, 10));
        percentageTextFields.setSpacing(10);
        */
        percentageGroupTwo.getChildren().addAll(displayPercent, updatePercent);

        MenuItem closePercentages;
        Menu percentageEditMenu = new Menu("Edit");
        /**
        MenuItem currentPercentages, updatePercentages, closePercentages;

        currentPercentages = new MenuItem("Load Current Percentages");
        currentPercentages.setOnAction(e ->
        {
            listCurrentPercentages(percentageStorage);
        });
        updatePercentages = new MenuItem("Update Percentages");
        updatePercentages.setOnAction(e ->
        {
            setUpdatePercentages(percentageStorage);
        });
         */
        closePercentages = new MenuItem("Close Percentages Window");
        closePercentages.setOnAction(e ->
        {
            percentageStage.close();
        });
        listPercent.setOnAction(e ->
        {
            try
            {
                AccountPercentages ap = new AccountPercentages();
                DatabaseConnection dbsql = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");

                percentageInformation(ap, dbsql);
                //dbsql.setDbTableList();
                String accountNameFromComboBox = (String) cmbList.getValue();
                //System.out.println(accountNameFromComboBox);
                String accountNameFromDatabase = (String) dbsql.getDbTableList().get(accountNameFromComboBox);
                //System.out.println("Account from database: " + accountNameFromDatabase);

                //double percent = dbsql.getAccountPercentages(accountNameFromDatabase);
                double percent = ap.getDatabaseNameToPercent().get(accountNameFromDatabase);
                //System.out.println(percent);
                displayPercent.setText("" + percent);
                //displayPercent.setText("" + dbsql.getAccountPercentages(  accountNameFromDatabase);
            }
            catch (SQLException s) {
                s.printStackTrace();
            }
        });

        percentageEditMenu.getItems().add(closePercentages);

        VBox percentageGroup = new VBox();
        /**
        for (int i = 0; i < 10; i++)
        {
            percentageGroup.getChildren().add(i, new Label("%"));
        }
        */
        percentageGroup.getChildren().addAll(percentageGroupOne, percentageGroupTwo);
        percentageGroup.setSpacing(21);
        percentageGroup.setPadding(new Insets(10, 10, 10, 10));

        percentageBorderPane.setTop(new MenuBar(percentageEditMenu));
        /**
        percentageBorderPane.setLeft(percentageGroupOne);
        percentageBorderPane.setCenter(percentageGroupTwo;
        */
        percentageBorderPane.setRight(percentageGroup);


        Scene percentageScene = new Scene(percentageBorderPane);

        percentageStage.setMinHeight(300);
        percentageStage.setMinWidth(200);
        percentageStage.setScene(percentageScene);
        percentageStage.show();
    }
    public void newWindowToAddPaycheck()
    {
        Stage addMoneyStage = new Stage();
        BorderPane bpAddMoney = new BorderPane();
        VBox vbAddMoneyLeft = new VBox();
        VBox vbAddMoneyCenter = new VBox();
        VBox vbAddMoneyRight = new VBox();
        HBox subCenter = new HBox();

        Label paycheckLabel = new Label("Paycheck");
        Label deductionLabel = new Label("Deduction");

        TextField paycheckTextField = new TextField();
        TextField deductionTextField = new TextField();
        TextField year = new TextField();
        year.setPromptText("year");
        TextField month = new TextField();
        month.setPromptText("month");
        TextField day = new TextField();
        day.setPromptText("day");
        TextField hour = new TextField();
        hour.setPromptText("hour");
        TextField minute = new TextField();
        minute.setPromptText("minute");
        subCenter.getChildren().addAll(year, month, day, hour, minute);

        Button doTheDeedButton = new Button(" x ");
        Button changeDeductionTypeButton = new Button(" - ");
        changeDeductionTypeButton.setOnAction(e ->
        {
            if (changeDeductionTypeButton.getText().equalsIgnoreCase(" - "))
            {
                changeDeductionTypeButton.setText("%");
            }
            else if (changeDeductionTypeButton.getText().equalsIgnoreCase("%"))
            {
                changeDeductionTypeButton.setText(" - ");
            }
        });
        doTheDeedButton.setOnAction(e ->
        {
            DatabaseConnection dbc = new DatabaseConnection();
            paycheckStuff.setPaycheck(Double.parseDouble(paycheckTextField.getText()));

            if (changeDeductionTypeButton.getText().equalsIgnoreCase(" - "))
            {
                paycheckStuff.setDeductionNumber(Double.parseDouble(deductionTextField.getText()));
                paycheckStuff.setNetDistribute(calculateNetDistributeWithNumber(paycheckStuff.getPaycheck(), paycheckStuff.getDeductionNumber()));
            }
            else if (changeDeductionTypeButton.getText().equalsIgnoreCase("%"))
            {
                paycheckStuff.setDeductionPercentage(Double.parseDouble(deductionTextField.getText()));
                paycheckStuff.setNetDistribute(calculateNetDistributeWithPercentage(paycheckStuff.getPaycheck(), paycheckStuff.getDeductionPercentage()));
            }

            try {
                paycheckStuff.setAccountAmounts(paycheckStuff.getNetDistribute(), year.getText(), month.getText(), day.getText(), hour.getText(), minute.getText());
            }
            catch (SQLException sl)
            {
                sl.printStackTrace();
            }
        });

        vbAddMoneyLeft.getChildren().addAll(paycheckLabel, deductionLabel);
        vbAddMoneyCenter.getChildren().addAll(paycheckTextField, deductionTextField, subCenter);
        vbAddMoneyRight.getChildren().addAll(doTheDeedButton, changeDeductionTypeButton);

        vbAddMoneyLeft.setSpacing(35);
        vbAddMoneyLeft.setPadding(new Insets(150, 10, 10, 10));
        vbAddMoneyCenter.setSpacing(20);
        vbAddMoneyCenter.setPadding(new Insets(150, 10, 10, 10));
        vbAddMoneyRight.setSpacing(20);
        vbAddMoneyRight.setPadding(new Insets(150, 10, 10, 10));

        bpAddMoney.setLeft(vbAddMoneyLeft);
        bpAddMoney.setCenter(vbAddMoneyCenter);
        bpAddMoney.setRight(vbAddMoneyRight);

        Scene addMoneyScene = new Scene(bpAddMoney);

        addMoneyStage.setScene(addMoneyScene);
        addMoneyStage.setWidth(450);
        addMoneyStage.setHeight(500);
        addMoneyStage.show();
    }
    public String balance()
    {
        //String que = "select balance from " + "iPhoneAccount" + " order by Date Desc limit 1";
        String balance = "40";
        List<AccountInfo> aDetails = new ArrayList<>();

        String que = "select * from " + "clothingAccount" + " order by Date Desc limit 1";
        try(
                Connection hahaha = DriverManager.getConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
                Statement listStatement = hahaha.createStatement();
                ResultSet statementExe = listStatement.executeQuery(que);
        )
        {

            while (statementExe.next())
            {

                balance = statementExe.getString("Balance");

            }
           // return aDetails;
        }
        catch (SQLException ss)
        {
            ss.printStackTrace();
        }
        return balance;
    }
    public double calculateNetDistributeWithNumber(double paycheck, double number)
    {
        double netDistribute = paycheck - number;

        return netDistribute;
    }
    public double calculateNetDistributeWithPercentage(double paycheck, double percentage)
    {
        double netDistribute = paycheck * (percentage / 100);

        return netDistribute;
    }

    public TableView getMoneyStuff()
    {
        return moneyStuff;
    }
    public void percentageInformation(AccountPercentages ap, DatabaseConnection dbsql) throws SQLException
    {
        try
        {
            ap.setDatabaseNameToPercent();
            dbsql.getAccountList();
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }
    }
    public void setMoneyStuff()
    {
        TableView ms = new TableView();

        TableColumn date = new TableColumn("Date");
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        date.setMinWidth(100);
        TableColumn account = new TableColumn("Account");
        account.setCellValueFactory(new PropertyValueFactory<>("Account"));
        account.setMinWidth(100);
        TableColumn balance = new TableColumn("Balance");
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        balance.setMinWidth(100);
        TableColumn transactionType = new TableColumn("Transaction_Type");
        transactionType.setCellValueFactory(new PropertyValueFactory<>("TransactionType"));
        transactionType.setMinWidth(150);
        TableColumn transaction = new TableColumn("Transaction");
        transaction.setCellValueFactory(new PropertyValueFactory<>("Transaction"));
        transaction.setMinWidth(100);
        TableColumn comment = new TableColumn("Comment");
        comment.setCellValueFactory(new PropertyValueFactory<>("Comment"));
        comment.setMinWidth(100);


        ms.getColumns().addAll(date, account, balance, transactionType, transaction, comment);
        this.moneyStuff = ms;
    }
    public double stringToDouble(String percentageString)
    {
        return (Double.parseDouble(percentageString) / 100);
    }
}
