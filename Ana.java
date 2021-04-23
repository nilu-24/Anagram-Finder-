package Recursion;
// Java program to distinct permutations of the string
public class Ana {


   //method to print all anagrams
    static void searchAnagrams(char[]word,int current_index) {

        if (current_index == word.length -1) {  //base case
            //we are at the last element so just print and return (1 permutation possible )
            System.out.println(word);
            return;
        }

        for (int i = current_index; i < word.length; i++) {
          //check for no duplicates
            boolean check_for_duplicates = Helper.checkDuplicates(word, current_index, i);
            if (check_for_duplicates) { //assuming it runs in O(1)
                //swap
                Helper.swap(word, current_index, i); //runs in O(1)

                searchAnagrams(word, current_index + 1);//recursive call

                Helper.swap(word, current_index, i); //runs in O(1)
                //swap again so that array is same for next swaps (challenging step)
            }
        }
    }


    // tester function
    public static void main(String[] args) {

        String s = "asas";
        searchAnagrams(s.toCharArray(),0);


    }


}

