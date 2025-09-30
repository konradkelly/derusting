public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
      String[] stringArr = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
      stringArr[0] = "Github";
      stringArr[1] = "Gitlab";
      stringArr[2] = "Gitea";
      stringArr[3] = "Bitbucket";
    // Get the value of the array at index 2
      String indexThree = stringArr[2];
      System.out.println(indexThree);
      System.out.println();
    // Get the length of the array
      int arrLen = stringArr.length;
      System.out.println(arrLen);

      System.out.println();

    // Iterate over the array using a traditional for loop and print out each item
      for (int i = 0; i < stringArr.length; i++) {
        System.out.println(stringArr[i]);
        
      }
      System.out.println();

    // Iterate over the array using a for-each loop and print out each item
      for (String item : stringArr) {
        System.out.println(item);
      }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
