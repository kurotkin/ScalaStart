package com.kurotkin.scalastart

class Prog (val name: String) {
  var programName: String = name

  def startWork() {
    println("Hello, I'm a simple program. My name is: " + this.name)
  }

}
