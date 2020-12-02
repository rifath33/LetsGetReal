public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *percentDifference of a as initial and b as final
  */
  public double percentDifference(double a, double b){
    double result = ( (b-a)/Math.abs(a) ) * 100 ;
    return result;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
     double sum = getValue() + other.getValue();
     RealNumber result = new RealNumber(sum);
     return result;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double product = getValue() * other.getValue();
    RealNumber result = new RealNumber(product);
    return result;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double quotient = getValue() / other.getValue();
    RealNumber result = new RealNumber(quotient);
    return result;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double difference = getValue() - other.getValue();
    RealNumber result = new RealNumber(difference);
    return result;
  }

}
