/**
  * Created by Ronald Erquiza on 4/12/2016.
  */
object PrimeFactorization {
    def main(args: Array[String]): Unit ={
      val scanner = new java.util.Scanner(System.in)
      println("Input Number: ")
      var integer = scanner.nextInt()
      var factor:Int = 2
      println("Prime Factors: ")
      while(integer > 2){
        if(integer % factor == 0){
          integer = integer/factor
          if(integer > 2)
            print(factor + " X ")
          else
            print(factor)
          factor = 2
        }
        else{
          factor+=1
        }
      }
    }
}
