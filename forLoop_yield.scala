object forLoop_yield
{
	def main(args : Array[String])
	{
	var a = 0;
	var numList = List(1,2,3,4,5,6,7,8,9);
	//for loop
	var reVal = for{ a <- numList if a !=3; if a< 8}yield a
	for( a <- reVal){
			println("Value od a : " +a)
			}
	}
}
