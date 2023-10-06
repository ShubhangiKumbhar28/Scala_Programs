object techMath
{
	def main(args: Array[String])
	{
		var technologies = List("Linux","Windows","Macos","Eclipse","NetBeans","R", "Scala","Java","Python")
		for (tech <- technologies) {
			println(tech)
		tech match {
			case "Linux"|"Windows"|"Macos" => println("Operating system")
			case "Eclipse"|"NetBeans" => println("IDES for Development")
			case "R"|"Scala"|"Java"|"Python" => println("Programing language")
			case _ => println("Not a Tech group member")
		}
	}
}
}
