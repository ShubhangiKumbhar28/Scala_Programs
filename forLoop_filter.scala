object forLoop_filter
{
	def main(args : Array[String])
	{
		var a = 0;
		val numlist = List(1,2,3,4,5,6,7,8,9);
		for(a <- numlist if a != 3; if a < 8 )
		{
			println("value of a : " + a);
		}
	}
}
