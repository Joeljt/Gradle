package closure

def str = "Th223is is a 213string33"
//println(str)

def test = {
    int age = 100, String name, String country = "China" ->
        return "My name is $name, and I'm $age years old, and I come from $country."
}
//println test( 10, "dad")
println test.call(country = "USA",name = "dsada",age = 12)


println str.collect {
    return it.isNumber()
}