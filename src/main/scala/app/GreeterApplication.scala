package app

import app.GreeterApplication.number

import scala.io.StdIn

object GreeterApplication extends App{

  /*def greet(name : String) : Unit = {
    if (name == "adam"){
      println(s"You dont get a hello")
    } else{
      println(s"Hello $name")
    }
  }

  val name = StdIn.readLine("What is your name? ")

  greet(name)*/



  /*for (i <- 2 until number.toInt){
    if ((number.toInt)%2 == 0){
      prime = false
    }


  }

  if (prime == true){
    println(number + " is prime")
  }else{
    println(number + " is not prime")
  }*/

  def primeChecker(number : String) : Unit = {
    var prime = true



    for (i <- 2 until number.toInt){
      println(i)
      if ((number.toInt)%i == 0){
        prime = false
      }


    }

    if (prime == true){
      println(number + " is prime")
    }else{
      println(number + " is not prime")
    }
  }



  val number = StdIn.readLine("Enter number:")

  primeChecker(number)











}
