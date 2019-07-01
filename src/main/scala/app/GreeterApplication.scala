package app

import scala.io.StdIn

object Prompt {
  def ask(message: String) = StdIn.readLine(message)
}

class Person(name : String, age : Int) {
  private val years : String = if(age > 1) "years" else "year"
  def speak() : String = {
    if (name == "adam") {
      s"You don't get a hello!"
    } else {
      s"Hello $name you are $age $years old"
    }
  }
}


object GreeterApplication extends App{

  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("How old are you? ")
  val person = new Person(name,age.toInt)
  println(person.speak())

abstract class BankAccount(accountNumber : String, balance: double){

  def withdraw(amount : Double) : BankAccount
  def deposit(amount : Double) : BankAccount
}

  final class SavingsAccount(accountNumber : String, balance: Double) extends BankAccount(accountNumber){
    override def withdraw(amount: Double): BankAccount = {
      0.00
    }

    override def deposit(amount: Double): BankAccount = {
      0.00
    }
  }

















}
