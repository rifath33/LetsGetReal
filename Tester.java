public class Tester{
  public static void main(String[] args){

    int rand = (int) Math.floor(Math.random() * 1000);
    int rand1 = (int) Math.floor(Math.random() * 1000);
    int rand2 = (int) Math.floor(Math.random() * 1000);
    int rand3 = (int) Math.floor(Math.random() * 1000);
    RationalNumber num = new RationalNumber(rand, rand1);
    RationalNumber other = new RationalNumber(rand*2, rand1*2);
    RationalNumber other1 = new RationalNumber(rand2, rand3);

    System.out.println(rand);
    System.out.println(rand1);
    System.out.println(num);
    System.out.println(rand*2);
    System.out.println(rand1*2);
    System.out.println(other);

    System.out.println(num.equals(other)); // "true"

    System.out.println(num.equals(other1)); // "false"

  }
}
