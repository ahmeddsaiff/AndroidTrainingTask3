class Tesla(override val model: String, override val color: String, override val speed: Int) :Car {
    override fun getFuelType(){
        println("Electric car")
    }
}