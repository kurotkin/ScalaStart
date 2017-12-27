package com.kurotkin.scalastart

object Program {
  def main(args: Array[String]) {
    printSimple()
  }

  def printSimple() {
    var simpleInteger: Int = 100500;
    val simpleString: String = "This is simple String";
    var simpleAutoDetectedInteger = 200800;
    val simpleAutoDetectedString = "This is simple auto detected String";

    println("simpleInteger:");
    println(simpleInteger);

    println("simpleString:");
    println(simpleString);

    println("simpleAutoDetectedInteger:");
    println(simpleAutoDetectedInteger);

    println("simpleString:");
    println(simpleAutoDetectedString);
  }
}