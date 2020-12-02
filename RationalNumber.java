public class RationalNumber extends Number{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
      if(deno !=0){
      numerator = nume;
      denominator = deno;
    }
    else{
      numerator = 0;
      denominator = 1;
    }
    reduce();
  }

  public double getValue(){
    if(denominator == 0){
    numerator = 0;
    denominator = 1;
  }
    return numerator/(double)denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    if(denominator == 0){
    numerator = 0;
    denominator = 1;
  }
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    if(denominator == 0){
    numerator = 0;
    denominator = 1;
  }
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
    reduce();

    if(getDenominator() > 0)
    return(
    ""+getNumerator()
    + "/" +
    ""+getDenominator()
    );
    else
    return(
    ""+ -getNumerator()
    + "/" +
    ""+ -getDenominator()
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

    if(b!=0)
    {
      if( a % b == 0)
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
    else return 23889; //ERR0R

  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

    int divisor = gcd(numerator, denominator);

    numerator=numerator/divisor;
    denominator=denominator/divisor;

  }

  /******************Operations Return a new RationalNumber!!!!****************/

  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber result = new RationalNumber
    (getNumerator() * other.getNumerator()
    ,
    getDenominator() * other.getDenominator()
    );
    return result;
  }

  public RationalNumber multiply(int a){
    RationalNumber result = new RationalNumber
    (getNumerator() * a
    ,
    getDenominator()
    );
    return result;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber result = multiply(other.reciprocal());
    return result;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber result = new RationalNumber(

    getNumerator() * other.getDenominator() +
    other.getNumerator() * getDenominator()
    ,
    getDenominator() * other.getDenominator()

    );
    result.reduce();
    return result;
  }

  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return(add(other.multiply(-1)));
  }

}
