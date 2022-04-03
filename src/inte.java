public class inte {
  public static void main(String[] args) {
    int number[] = new int[20];
    for (int i = 1; i <  number.length; i++) {
      number[i] = number[i - 1] + 5;
    }
    // numberの表示
    for (int i = 0; i < number.length; i++) {
      System.out.println(String.format("%2d %4d", i, number[i]));
    }
  }
}