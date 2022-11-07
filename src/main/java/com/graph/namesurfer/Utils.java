package com.graph.namesurfer;

import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    public static String Capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public  static  void ShowSimpleMessage(String message){
        Dialog<String> dlg = new Dialog<>();
        dlg.setTitle("Information");
        dlg.setContentText(message);
        ButtonType btnType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dlg.getDialogPane().getButtonTypes().add(btnType);
        dlg.showAndWait();    }
}
