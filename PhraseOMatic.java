package headfirst;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"I","Juliana","Dawar","Jared","Ceasar"};
        String[] wordListTwo = {"dying", "happy", "eager", "sad"};
        String[] wordListThree = {"pizza", "lasagna", "pasta", "potatoes"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] +" was " + wordListTwo[rand2] + " to eat " + wordListThree[rand3];
        System.out.println("At lunch time " + phrase);

    }
}
