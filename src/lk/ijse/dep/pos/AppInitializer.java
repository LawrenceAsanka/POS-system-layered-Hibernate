package lk.ijse.dep.pos;

import java.io.IOException;

import lk.ijse.dep.pos.db.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {

  public static void main(String[] args) {
    launch(args);

    HibernateUtil.getSessionFactory().close();

  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dep/pos/view/MainForm.fxml"));
    Scene mainScene = new Scene(root);
    primaryStage.setScene(mainScene);
    primaryStage.setTitle("JDBC POS");
    primaryStage.centerOnScreen();
    primaryStage.show();

  }
}
