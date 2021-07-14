package controller

import fxbean.*
import javafx.event.*
import javafx.fxml.*
import javafx.scene.*
import javafx.stage.*
import org.gerrie.scalafxform.fxform.*
import org.gerrie.scalafxform.layout.*
import org.gerrie.scalafxform.util.*

import java.net.*
import java.util.*

final case class ControllerMain():
    var loaded = false
    @FXML
    private var resources : ResourceBundle = null
    @FXML
    private var location : URL = null
    @FXML
    def onSample1Click(event : ActionEvent) = 
        if loaded then
            val sample1 = Sample1("TEST")
            val sample1Node = FXForm(sample1)
            val stage = Stage()
            val scene = Scene(sample1Node.asInstanceOf[Parent])
            stage.setScene(scene)
            stage.showAndWait()

    @FXML
    def onSample2Click(event : ActionEvent) = 
        if loaded then
            val sample2 = Sample2()
            val sample2Node = FXForm(sample2)
            val stage = Stage()
            val scene = Scene(sample2Node.asInstanceOf[Parent])
            stage.setScene(scene)
            stage.showAndWait()

    @FXML
    def onSample3Click(event : ActionEvent) = 
        if loaded then
            val sample3 = Sample3()
            val sample3Node = FXForm(sample3)
            val stage = Stage()
            val scene = Scene(sample3Node.asInstanceOf[Parent])
            stage.setScene(scene)
            stage.showAndWait()

    @FXML
    def onLoadViewsClick(event : ActionEvent) = 
        val dirChooser = DirectoryChooser()
        val file = dirChooser.showDialog(Stage())
        if file != null then
            Load.loadViews(file.getAbsolutePath())
            loaded = true

    @FXML
    def onFormDefClick(event : ActionEvent) = 
        Form.showMain(Stage())

    @FXML
    def inititlize() = ()