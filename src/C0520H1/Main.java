package C0520H1;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Window;

public class Main{
    public static void dialogAlert(String msg, Event event) {
        dialogAlert(msg, event, AlertType.WARNING);
    }//from   ww  w . j a v  a  2s. co m
    public static void dialogAlert(String msg, Event event, AlertType tipo) {
        Alert alert = new Alert(tipo);
        if (event != null)
            alert.initOwner(getWindowFromEvent(event));
        alert.setTitle("Atention");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
    public static Window getWindowFromEvent(Event e) {
        return ((Node) e.getSource()).getScene().getWindow();
    }
}
