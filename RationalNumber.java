public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if(deno !=0){
      numerator = nume;
      denominator = deno;
    }
    else{
      numerator = 0;
      denominator = 1;
    }

  }

  public double getValue(){
    return numerator/(double)denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber result = new RationalNumber(getDenominator(),getNumerator());
    return result;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return(
    (getNumerator()==other.getNumerator())&&
    (getDenominator() == other.getDenominator())
    );
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return(
    ""+getNumerator()
    + "/" +
    ""+getDenominator()
    );
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  public static int gcd(int a, int b){
    /*use euclids method or a better one
    http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    */
    // If a<b, exchange a and b.
    // Divide a by b and get the remainder, r. If r=0, report b as the GCD of
    // a and b.
    // Replace a by b and replace b by r. Return to the previous step.

    if(a < b){
      int memory = a;
      a = b;
      b = memory;
    }

    if( a % b ==0)
    return b;
    else{
      while( (b!= 0) && (a % b !=0) ){
      int memory = a;
      a = b;
      b = memory % b;
    }
    return b;
    }

  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
