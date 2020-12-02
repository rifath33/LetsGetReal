public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if(getValue() == other.getValue())
    return 0;
    else{
      if(getValue() < other.getValue())
      return -1;
      else{
        if(getValue() > other.getValue())
        return 1;
        else return 9999; // lol this will neverrrr happen
      }
    }
  }

  /*
  *percentDifference of a as initial and b as final
  */
  public double percentDifference(double a, double b){
    double result = ( (b-a)/Math.abs(a) ) * 100 ;
    return result;
  }

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if(getValue() == 0)
    return(other.getValue() == 0);
    else{
      return(
      ( percentDifference(getValue(), other.getValue()) <= 0.001 )
      &&
      ( percentDifference(other.getValue(), getValue()) <= 0.001 )
      );
    }

  }

}
