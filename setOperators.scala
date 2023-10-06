object setOperators
{
	def main(args: Array[String])
	{
		val ranks = Set(5,6,8,3);
		val ranksnew = Set(1,3,6,34,232,67);
		
		println("MAX Rank in Ranks : " + ranks.max);
		println("MIN Rank in Ranks : " + ranks.min);
	
		println("ranks.intersect(ranksnew) : " + ranks.intersect(ranksnew) );
	}
}
