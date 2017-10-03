package ru.job4j;

/**
*Class Calculate решение задачи части 001 урок1.
*author thay
*@since 9.30.2017
*/
public class Calculate {

/**
*This is a method for testing
*@param value line for output console 
*@return String value.
*/
  public String echo(String value) {
   return String.format ("%s %s %s" , value, value, value);
}
    public static void main(String[] args)  {
     Calculate calc = new Calculate();
     System.out.println(calc.echo("aah"));
}
}