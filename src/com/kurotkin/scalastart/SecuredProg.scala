package com.kurotkin.scalastart

class SecuredProg(override val name: String, val securityCertificate: String) extends Prog(name){

  override def startWork() {
    println("Hello, I'm a secured program. My name is: " + this.name);
    println("I have security certificate: " + this.securityCertificate);
  }
}
