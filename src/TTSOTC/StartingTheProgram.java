package TTSOTC;

/**
 * Created by user on 12.09.2015.
 */
public class StartingTheProgram {
    public static void main(String[] arg) {
        MainView view = new MainView();
        MainModel model = new MainModel();
        MainController mainController = new MainController(model, view);
    }
}
