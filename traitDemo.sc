//Multiple inheritance can be demonstrated using traits
//Body trait
trait Body {
  //Weight as the member/reference variable of type Int
  val weight: Int
  //A funtion that returns the weight of type int
  //A trait can consists a function that is implemented within the trait
  def getWeight = weight
}

//Engine trait
trait Engine {

  //Engine as the member/reference variable of type Int
  val engine: Int
  //A funtion that returns the Engine of type int
  def getEngine = engine
}

trait Price {
  //Member/reference variable price that is fixed at 100
  val price = 100
}

//Class car implements all the three traits above
class Car extends Body with Engine with Price{
  //passes weight to constructor of Body
  val weight = 140
  //passes engine to constructor of Engine
  val engine = 12
  //overrides the fixed price 100 in trait Price
  override val price = 130
}

//Creating an object of Car class & accessing members of Parent traits
val car:Car = new Car
println("Weight of the car is : "+car.weight)
println("Engine capacity of the car is : "+car.engine)
println("Price of the car is : "+car.price)