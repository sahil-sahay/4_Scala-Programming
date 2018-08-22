//Creating a new class Vehicle with class parameter as Speed 
class Vehicle(speed:Int) {
  //Declaring a variable kmph that will store the value of speed passed to constructor of class Vehicle
  val kmph :Int = speed
  //Declaring a funtion that contains a print statement specifying it's class name followed by Racing keyword
  def race() = println("Racing Vehicle")
}

//Class car inheriting class Vehicle with the same parameter as that of vehicle class
class Car(speed:Int) extends Vehicle(speed){
  //Overriding the Parent class kmph value with self speed value
  override val kmph : Int=speed
  //Overring the method of Parent class Vehicle with self defined method
  override def race() = println("Racing Car")
}

//Class Bike inheriting class Vehicle with the same parameter as that of vehicle class
class Bike(speed:Int) extends Vehicle(speed){
  //Overriding the Parent class kmph value with self speed value
  override val kmph : Int=speed
  //Overring the method of Parent class Vehicle with self defined method
  override def race() = println("Racing Bike")
}
//Creating a Singleton Object DemoInheritance to instantiate classes created 
object DemoInheritance {
  //Starting point for the application
  def main(args: Array[String]) {
    //Creating an instance of car with a speed value of 180 passed as argument to the class constructor
    val ins_car = new Car(180)
    //Printing the overriden speed of car class
    println(ins_car.kmph )
    //Invoking the overriden method of car class
    ins_car.race()

    //Creating an instance of bike with a speed value of 120 passed as argument to the class constructor
    val ins_bike = new Bike(120)
    //Printing the overriden speed of bike class
    println(ins_bike.kmph )
    //Invoking the overriden method of bike class
    ins_bike.race()
  }
}
