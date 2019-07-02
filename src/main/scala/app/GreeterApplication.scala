package app

import scala.io.StdIn

object Prompt {
  def ask(message: String) = StdIn.readLine(message)
}

class Person(name : String, age : Int , colour : String) {
  private val years : String = if(age > 1) "years" else "year"
  private val colours : String = if(colour == "orange") "orange (my favorite colour as well)" else colour
  def speak() : String = {
    if (name == "adam") {
      s"You don't get a hello!"
    } else {
      s"Hello $name you are $age $years old and your favorite colour is $colours"
    }
  }
  def randNum() {
    do{
      val r = scala.util.Random
      println(r.nextInt(100))
    }while (Prompt.ask("Would you like another random number/ Y/N").toUpperCase() == "Y")


  }
}

class Game(digits : Int, maxGuesses : Int){
  private var guesses = 0
  private val code = randNum
  def randNum() {
    val r = scala.util.Random
    r.nextPrintableChar()
  }
  def play(){
    var usersGuess = Prompt.ask("Guess the character")
    //TESt
    println(code)
    //TEST
    if (guesses >= maxGuesses){
      println("GAME OVER")
      sys.exit()
    }
    if (usersGuess == code){
      return ("Correct")
    }
    else{
      guesses += 1
      play()
    }
  }


}


object GreeterApplication extends App {
  /*val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("How old are you? ")
  val colour = Prompt.ask("What is your favorite colour? ")
  val person = new Person(name, age.toInt, colour)
  println(person.speak())
  println(person.randNum())*/
  val game = new Game(0,20)
  game.play()
}


/*abstract class BankAccount(accountNumber : String, balance: Double){

  def withdraw(amount : Double) : BankAccount
  def deposit(amount : Double) : BankAccount
}


final class SavingsAccount(accountNumber: String,balance : Double) extends BankAccount(accountNumber,balance){
  override def withdraw(amount: Double): BankAccount = {
    if ((balance - amount) < 0) {
      println(s"You have insuffient funds")
      this
    } else {
      val deducted = balance - amount
      println(s"Balance after deducted: $deducted")
      new SavingsAccount(accountNumber,deducted)
    }
  }

  override def deposit(amount: Double): BankAccount = {
    new SavingsAccount(accountNumber,balance+ amount)
  }

final class CashISASavingsAccount(accountNumber: String,balance : Double) extends BankAccount(accountNumber,balance){
  override def withdraw(amount: Double): BankAccount = {
    println(s"You can't withdraw yet, your money is locked away for 3 years!")
    this
  }

  override def deposit(amount: Double): BankAccount = {
    new CashISASavingsAccount(accountNumber,balance + amount)
  }
}*/
















