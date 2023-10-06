object techMatch_case
{
	def main(args: Array[String])
	{
		var technologies = List("Linux","Windows","Macos","Eclipse","NetBeans","R","scala","Java","Python")
		for (tech <- technologies){
			println(tech)
		tech match {
			   case ""
