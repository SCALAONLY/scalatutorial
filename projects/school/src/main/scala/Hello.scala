import me.shadaj.ScalaPlugin

object Hello {

  def p( in: String ) {
    p(in)
  }
  
  def main(args: Array[String]) {

    val or = false
    var robber2 = true

    if (or) {
      p("")
      p("SuperHero!: It's OK!")
      p("")
      robber2 = false
    }
    else {
      p("")
      p("SuperHero!: It isn't ok.... ")
      p("")
      robber2 = true
    }

    if (robber2) {
      p("Robber: YES! My plan is run VERY WELL!!!")
      p("        SuperHero DIES NOW!!!!!!! MUHAHAHAHAHAHAHAHAhahahahaha...")
    }
    else {
      p("Robber: Oh no!")
      p("        SuperHero breaks my plan! I hate that SuperHero!")
    }

  }

}
