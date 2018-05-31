package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Cell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;

public class Controller implements Initializable {
    @FXML
    public HBox addCharacterForm;

    @FXML
    public TextField nameField;
    public TableColumn tcI29;
    public TableColumn tcI28;
    public TableColumn tcI27;
    public TableColumn tcI26;
    public TableColumn tcI25;
    public TableColumn tcI24;
    public TableColumn tcI23;
    public TableColumn tcI22;
    public TableColumn tcI21;
    public TableColumn tcI20;
    public TableColumn tcI19;
    public TableColumn tcI18;
    public TableColumn tcI17;
    public TableColumn tcI16;
    public TableColumn tcI15;
    public TableColumn tcI14;
    public TableColumn tcI13;
    public TableColumn tcI12;
    public TableColumn tcI11;
    public TableColumn tcI10;
    public TableColumn tcI9;
    public TableColumn tcI8;
    public TableColumn tcI7;
    public TableColumn tcI6;
    public TableColumn tcI5;
    public TableColumn tcI4;
    public TableColumn tcI3;
    public TableColumn tcI2;
    public TableColumn tcI1;
    public TextField attackField;
    public TextField rollField;

    @FXML
    TableColumn<Character, String> tcName;

    @FXML
    TableView<Character> tblCharacters;

    @FXML
    TableColumn<Character, Number> tcRoll;

    @FXML
    TableColumn<Character, Number> tcAttacks;

    @FXML
    TableColumn<Character, String> tcI30;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tblCharacters.setEditable(true);

        System.out.println("Initialize called");
        tcName.setCellValueFactory(new PropertyValueFactory<Character, String>("name"));
        tcRoll.setCellValueFactory( new Callback<TableColumn.CellDataFeatures<Character, Number>, ObservableValue<Number>>() {
            @Override
            public ObservableValue<Number> call(TableColumn.CellDataFeatures<Character, Number> p) {
                return new SimpleIntegerProperty(p.getValue().getRoll());
            }
        } );

        tcRoll.setCellFactory(TextFieldTableCell.<Character, Number>forTableColumn( new NumberStringConverter()) );
        tcRoll.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Character, Number>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Character, Number> event) {
                Character rowChar = event.getRowValue();
                rowChar.setRoll(event.getNewValue().intValue() );

                //Determine cadence of attacks
                if (rowChar.getAttacks() > 0) {
                    rowChar.clearAttacks();
                    rowChar.attackCadence(rowChar.getRoll(), rowChar.getAttacks());
                    //cadence(rowChar.getRoll(), rowChar.getAttacks());

                } else rowChar.clearAttacks();

                //Stupid hack as it doesn't show unless you hide and show
                event.getTableView().getColumns().get(3).setVisible(false);
                event.getTableView().getColumns().get(3).setVisible(true);
            }
        });

        tcAttacks.setCellValueFactory( new Callback<TableColumn.CellDataFeatures<Character, Number>, ObservableValue<Number>>() {
            @Override
            public ObservableValue<Number> call(TableColumn.CellDataFeatures<Character, Number> p) {
                return new SimpleIntegerProperty(p.getValue().getAttacks());
            }
        } );

        tcAttacks.setCellFactory(TextFieldTableCell.<Character, Number>forTableColumn( new NumberStringConverter()) );
        tcAttacks.setOnEditCommit( new EventHandler<TableColumn.CellEditEvent<Character, Number>>() {
           @Override
           public void handle(TableColumn.CellEditEvent<Character, Number> e) {
               Character rowChar = e.getRowValue();
               rowChar.setAttacks( e.getNewValue().intValue() );

               System.out.println( "   Attacks : " + e.getNewValue());

               rowChar.clearAttacks();
               rowChar.attackCadence(rowChar.getRoll(), rowChar.getAttacks());
               //Stupid hack as it doesn't show unless you hide and show
               e.getTableView().getColumns().get(3).setVisible(false);
               e.getTableView().getColumns().get(3).setVisible(true);

               //cadence(rowChar.getRoll(), rowChar.getAttacks());
           }
        });

        tcI30.setCellValueFactory(new PropertyValueFactory<Character, String>("i30"));
        tcI30.setCellValueFactory(new PropertyValueFactory<Character, String>("i30"));
        tcI29.setCellValueFactory(new PropertyValueFactory<Character, String>("i29"));
        tcI28.setCellValueFactory(new PropertyValueFactory<Character, String>("i28"));
        tcI27.setCellValueFactory(new PropertyValueFactory<Character, String>("i27"));
        tcI26.setCellValueFactory(new PropertyValueFactory<Character, String>("i26"));
        tcI25.setCellValueFactory(new PropertyValueFactory<Character, String>("i25"));
        tcI24.setCellValueFactory(new PropertyValueFactory<Character, String>("i24"));
        tcI23.setCellValueFactory(new PropertyValueFactory<Character, String>("i23"));
        tcI22.setCellValueFactory(new PropertyValueFactory<Character, String>("i22"));
        tcI21.setCellValueFactory(new PropertyValueFactory<Character, String>("i21"));
        tcI20.setCellValueFactory(new PropertyValueFactory<Character, String>("i20"));
        tcI19.setCellValueFactory(new PropertyValueFactory<Character, String>("i19"));
        tcI18.setCellValueFactory(new PropertyValueFactory<Character, String>("i18"));
        tcI17.setCellValueFactory(new PropertyValueFactory<Character, String>("i17"));
        tcI16.setCellValueFactory(new PropertyValueFactory<Character, String>("i16"));
        tcI15.setCellValueFactory(new PropertyValueFactory<Character, String>("i15"));
        tcI14.setCellValueFactory(new PropertyValueFactory<Character, String>("i14"));
        tcI13.setCellValueFactory(new PropertyValueFactory<Character, String>("i13"));
        tcI12.setCellValueFactory(new PropertyValueFactory<Character, String>("i12"));
        tcI11.setCellValueFactory(new PropertyValueFactory<Character, String>("i11"));
        tcI10.setCellValueFactory(new PropertyValueFactory<Character, String>("i10"));
        tcI9.setCellValueFactory(new PropertyValueFactory<Character, String>("i9"));
        tcI8.setCellValueFactory(new PropertyValueFactory<Character, String>("i8"));
        tcI7.setCellValueFactory(new PropertyValueFactory<Character, String>("i7"));
        tcI6.setCellValueFactory(new PropertyValueFactory<Character, String>("i6"));
        tcI5.setCellValueFactory(new PropertyValueFactory<Character, String>("i5"));
        tcI4.setCellValueFactory(new PropertyValueFactory<Character, String>("i4"));
        tcI3.setCellValueFactory(new PropertyValueFactory<Character, String>("i3"));
        tcI2.setCellValueFactory(new PropertyValueFactory<Character, String>("i2"));
        tcI1.setCellValueFactory(new PropertyValueFactory<Character, String>("i1"));

        //Add predefined characters
        tblCharacters.getItems().addAll( fetchData() );
    }

    @FXML
    public void addCharacter() {
        System.out.println("addCharacter called");

        int roll;
        int attacks;

        if (rollField.getText().isEmpty()) {
            roll = 0;

        } else roll = Integer.parseInt(rollField.getText());

        if (attackField.getText().isEmpty()) {
            attacks = 0;
        } else attacks = Integer.parseInt(attackField.getText());

        Character newChar = new Character(nameField.getText(), roll, attacks);

        if (newChar.getName().length() > 0 ) {
            System.out.println("   Attempt to get nameField " + nameField.getText() );
        }


        Task<List<Character>> task = new Task<List<Character>>() {
            @Override
            protected List<Character> call() throws Exception {
                return fetchData();
            }

            @Override
            protected void succeeded() {
                //tblCharacters.getItems().clear();
                //tblCharacters.getItems().addAll( getValue() );

                //tblCharacters.getItems().addAll(existing);

                if (newChar.getName().length() > 0 ) {
                    tblCharacters.getItems().add(newChar);
                    newChar.attackCadence(newChar.getRoll(), newChar.getAttacks());
                }

                /*for (Character c : existing) {
                    System.out.println("Looping existing: " + c.getName() );
                    tblCharacters.getItems().add(c);
                } */
            }
        };

        new Thread(task).start();
    }

    private List<Character> fetchData() {

        List<Character> characterList = new ArrayList<>();

        characterList.add( new Character("Gideon") );
        characterList.add( new Character("Mike" ) );
        characterList.add( new Character("Mars" ) );

        return characterList;
    }


}
