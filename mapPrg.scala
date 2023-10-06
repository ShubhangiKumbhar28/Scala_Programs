object mapPrg
{
	def main(args: Array[String])
	{
		val natureofTech = Map("Hadoop" -> "BIGDATA",
					"Spark" -> "In-Memory",
					"Iot" -> "AI" ); 
		println("Keys in natureofTech : " + natureofTech.keys )
		println("Valeus in natureofTech : " + natureofTech.values)
	}
}
