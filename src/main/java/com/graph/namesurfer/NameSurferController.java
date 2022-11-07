package com.graph.namesurfer;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;

public class NameSurferController {

   @FXML private LineChart Graph;
   @FXML private TextField NameTextField;

   @FXML protected void onGraphButtonClick(){
      Utils.ShowSimpleMessage("Button Graph");
   }
   @FXML protected void onClearButtonClick(){
      Utils.ShowSimpleMessage("Clear Graph");
   }

   @FXML protected void onNameTextFieldEnter(){
      Utils.ShowSimpleMessage(NameTextField.getText());
      NameDataEntre tmp = NameSurferDB.getData().getNDE(Utils.Capitalize(NameTextField.getText()));
      if (tmp != null) {
         XYChart.Series<Integer, Integer> ser = new XYChart.Series<>();

         for (int i = 0; i < tmp.getPointsCount(); i++) {
            XYChart.Data<Integer, Integer> point = new XYChart.Data<>( i, tmp.getValue(i));
            ser.getData().add(point);
            //ser.getData().
         }
         Graph.getData().add(ser);

      }

         else Utils.ShowSimpleMessage("NO");
   }
}
