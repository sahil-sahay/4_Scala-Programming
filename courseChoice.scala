object courseChoice
{
  def courseMatch(courseName:String):Unit =
  {
    val result = courseName match
    {
      case "Android App Development" => println("Price for AAD course is : 14,999 INR")
      case "Data Science" => println("Price for DS course is : 49,999 INR")
      case "Big Data Hadoop & Spark Developer" => println("Price for BD & Spark course is : 24,999 INR")
      case "Blockchain Certification" => println("Price for BCC course is : 49,999 INR")
      case _ => println("This course is yet to come")
    }
  }

  def main(args:Array[String]): Unit ={
    courseMatch("Android App Development")
    courseMatch("Data Science")
    courseMatch("Big Data Hadoop & Spark Developer")
    courseMatch("Blockchain Certification")
    courseMatch("Teleporting Basics")
  }
}
