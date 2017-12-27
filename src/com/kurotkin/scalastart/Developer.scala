package com.kurotkin.scalastart

class Developer(val name: String, val specialty: String) {
  var developerName: String = name;
  var developerSpecialty = specialty;

  def writeCode() {
    println(this.developerSpecialty + " writes code.");
  }
}
