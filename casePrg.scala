object casePrg
{
	def main(args: Array[String])
	{
		var days = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun","Jan")
		for( day <- days){
				println(day)
		day match
		{
			case "Mon" => println("First day of week.")
			case "Tue" => println("Second day of week.")
			case "Wed" => println("Third day of week.")
			case "Thu" => println("Fourth day of week.")
			case "Fri" => println("Fifth day of week.")
			case "Sat" => println("Sixth day of week.")
			case "Sun" => println("Seventh day of week.")
			case _  => println("Not a Day.")
		}
	}
}
}
