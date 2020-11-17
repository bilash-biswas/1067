object Main {
  def main(args:Array[String]){ 
    var a = scala.io.StdIn.readInt()
    for(i <- 1 to a by 2){
      println(i)
    }
  }
}
