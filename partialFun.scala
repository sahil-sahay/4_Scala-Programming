// singleton object to call the functions
object partialFun
{
  //Sqaure function that takes an integer & returns square of that integer.
  def squareFun(x: Int): Unit ={
    //printing the square
    println("Square of added number is  = "+ x*x)
  }
  //A Partial function to add two integers passed during runtime with one pre-defined integer & returning the sum as Int
  def partAdd(x: Int,y: Int, z:Int)=x+y+z
    //Adding two dynamic & one static values & saving result in sum_val variable
    val sum_val =partAdd(5,_:Int,_:Int)

  //A function to call both the functions using values passed from main method.
  def partialFunc(a: Int, b: Int): Unit ={

    //Printing sum of all the the values adding a & b with the constant input.
    println("Addition all the three numbers we get = "+sum_val(a,b))
    //Calling the squareFun function & passing returned value of partial function as arguments to it.
    squareFun(sum_val(a,b))
}
  //Entry point for the application.
  def main(args:Array[String]): Unit ={
    println("Enter the value of the numbers: ")
    //Reading both the input values a & b.
    var a:Int = scala.io.StdIn.readLine().toInt // reading the input value
    var b:Int = scala.io.StdIn.readLine().toInt
    //Calling the partialFunc method from Main by passing the inputs numbers as arguments.
    partialFunc(a,b) //
  }
}
