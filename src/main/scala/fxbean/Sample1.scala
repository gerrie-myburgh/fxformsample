package fxbean

import org.gerrie.scalafxform.nodes.*
import org.gerrie.scalafxform.util.*

final case class Sample1(name : String) extends VM:
    def getFieldName(): String = ""
    def makeCopy() = Sample1(name)

    val field2 = DisplayComboBox("ONE","TWO")
    val field3 = DisplayRadioGroup("A","B","C")
    val field4 = DisplayText("NO TEXT")

    def getField4() = field4.get() 
    def getField3() = field3.get()
    def getField2() = field2.get()

    override def toString() = name

final case class Sample2() extends VM:
    def getFieldName(): String = ""
    def makeCopy() = Sample2()

    val field1 = DisplayBoolean()
    val field2 = DisplayComboBox("OPTION1", "OPTION2", "OPTION3", "OPTION4")
    val field3 = DisplayDatePicker()
    val field4 = DisplayRadioGroup(Sample1("ONE"), Sample1("TWO"))
    val field5 = DisplayText()
    val field6 = DisplayList[Sample1](() => Sample1(""))
    field6.values(Sample1(""), Sample1(""))

final case class Sample3() extends VM:
    def getFieldName(): String = ""
    def makeCopy() = Sample2()

    val button = DisplayButton()
    val editor = DisplayHTMLEditor()

    button.set(Some((Null) => println("HELLO...\n" + editor.get())))
