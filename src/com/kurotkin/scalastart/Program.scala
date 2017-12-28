package com.kurotkin.scalastart
import com.kurotkin.scalastart.Developer

object Program {
  def main(args: Array[String]) {
    printSimple()
    println("_________________")
    devPrint()
    println("_________________")
    testProgram()
  }

  def testProgram(): Unit ={
    var program = new Prog("Simple Program")
    program.startWork()

    var securedProgram = new SecuredProg("Secured Program", "Security Certificate")
    securedProgram.startWork()
  }


  def devPrint(): Unit ={
    val javaScalaDeveloper = new Developer("Eugene Suleimanov", "Java/Scala Developer")

    javaScalaDeveloper.developerName = "New name"
    println("Developer name: " + javaScalaDeveloper.developerName)
    println("Developer specialty: " + javaScalaDeveloper.developerSpecialty)
    javaScalaDeveloper.writeCode()
  }

  def printSimple() {
    var simpleInteger: Int = 100500
    val simpleString: String = "This is simple String"
    var simpleAutoDetectedInteger = 200800
    val simpleAutoDetectedString = "This is simple auto detected String"

    println("simpleInteger:")
    println(simpleInteger)

    println("simpleString:")
    println(simpleString)

    println("simpleAutoDetectedInteger:")
    println(simpleAutoDetectedInteger)

    println("simpleString:")
    println(simpleAutoDetectedString)
  }
}