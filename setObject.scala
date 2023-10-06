object setObject{
	def main(args: Array[String])
	{
		val car1 = Set("Benz", "Audi", "BMW");
		val car2 = Set("i10", "i20");
		val car3 = Set("Swift", "Santro", "Creta");

		var carset = car1.++(car2).++(car3)
		println("Select Cars : " +  carset);
	}
}
