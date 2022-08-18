class BMW(override var model: String, override var color: String, override var speed: Int) :Car {
    override fun getFuelType(){
        println("bmw benzene")
    }

}