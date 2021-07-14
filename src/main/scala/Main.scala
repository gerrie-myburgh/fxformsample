
import controller.*
import javafx.application.*
import javafx.fxml.*
import javafx.scene.*
import javafx.stage.*
import org.gerrie.scalafxform.util.*

@main def main() =
    Application.launch(classOf[App])

class App extends Application:

  /************************************************************************** 
   * start of application
   */
  override def start(stage : Stage) =
        val loader = FXMLLoader()
        loader.setLocation(getClass().getResource("/form_my_main.fxml"))
        val root = loader.load().asInstanceOf[javafx.scene.layout.VBox]
        val scene = Scene(root)
        stage.setScene(scene)
        stage.show()               

  /************************************************************************** 
   * all cleanup actions
   */
  override def stop() = 
    RunConfig.storeConfig()

val msg = "Nothing"

