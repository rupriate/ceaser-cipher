
import scala.io.StdIn

object ceaser {

    def encrypt(text:String, shift:Int):String={
        var newText:String="";
        for(i <- 0 until text.length){
            var changingletter=text.charAt(i).toInt;
            if(changingletter>)

            newText = newText.concat((text.charAt(i).toInt + shift).toChar.toString);
        }
        return newText;



    }
  
    def main(args: Array[String]): Unit= {
        printf("Enter Text : ");
        val plaintext=scala.io.StdIn.readLine();

        printf("Enter Shift : ");
        val shift=scala.io.StdIn.readInt();
    
        printf(encrypt(plaintext,shift));

  }
}
