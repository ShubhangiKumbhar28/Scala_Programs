object numMtch_case
{
	def main(args: Array[String]){
		println(matchNum(3))
	}
	def matchNum(x: Int): String = x match
	{
		case 1 => "one"
		case 2 => "Two"
		case 3 => "Three"
		case 4 => "Four"
		case _ => "Anything..Not a number"
	}
}
