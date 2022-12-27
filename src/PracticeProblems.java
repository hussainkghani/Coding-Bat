public class PracticeProblems {

  public static void main(String[] args) {
    System.out.println(diff21(5));
    System.out.println(sleepIn(true, false));
    System.out.println(nearHundred(8));
    System.out.println(helloName("Hussain"));
    System.out.println(makeOutWord("<<>>", "Yay"));
  }

  //Warm up Questions
  public static boolean sleepIn(boolean weekday, boolean vacation) {
    if(weekday == false && vacation == true){
      return true;
    }
      return false;
  }

  public static int diff21(int n){
    if(n<=21){
      return 21 - n;
    }else{
      return (n - 21) * 2;
    }
  }

  public static boolean nearHundred(int n)
  {
    while((Math.abs(100 - n) <= 10) || (Math.abs(200-n)<=10)) {
      return true;
    }
    return false;
  }

  //String-1 Question Set
  public static String helloName(String name){
    return "Hello " + name + "!";
  }

  public static String makeOutWord(String out, String word){
    return out.substring(0, 2) + word + out.substring(2, 4);
  }

  public static String firstHalf(String str){
    return str.substring(0, str.length()/2);
  }

  //Array-1 Question Set
  public static boolean firstLast6(int[] nums){
    if(nums.length==0){  //false result if array has no length
      return false;
    }
    if(nums[0] == 6){  //if the first position is 6 return true
      return true;
    }
    else if(nums[nums.length-1]==6) {
      return true;
    }else return false;
  }

}
