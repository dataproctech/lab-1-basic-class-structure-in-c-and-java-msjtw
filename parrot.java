import java.util.*;

public class Parrot {
    // Attributes
    List<String> words_ = new ArrayList<>();
    Random rand = new Random();
    int number_;

    // Constructor
    public Parrot(String word, int number) {
        words_.add(word);
        number_ = number;
    }

    public void say(){
        int k = rand.nextInt(words_.size());
        for(int i = 0; i < number_; i++)
            System.out.println(words_.get(k));
    }

    public void changeWord(String newWord, int number){
        words_.add(newWord);
        number_ = number;
    }


    public static void main(String[] args) {
        Parrot parrot = new Parrot("aaaa", 2);
        parrot.say();
        parrot.changeWord("dsds", 3);
        parrot.say();
    }
}
