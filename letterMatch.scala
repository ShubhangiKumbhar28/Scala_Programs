object letterMatch
{
	def main(args: Array[String]){
		for(x <- 0 to 15){
			println(x)
		x match {
			case x if x % 2 == 0 => println("number is even")
			case x if x % 2 == 1 => println("number is odd")
			case _ => println("not an even or odd number")
			}
		}
	}
}

