object forLoop_Collection
{
	def main(arg : Array[String])
	{
		var a = 0;
		var numlist = List("Shubangi",'s',10000,45.45f,45,true);
		for(a <- numlist)
		{
			println("Values of a : " + a);
		}
	}
}
