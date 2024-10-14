#include<iostream>
#include<vector>
#include<cstdlib>
#include<ctime>

using namespace std;

class Parrot{
    int number;
    vector<string> words;

    public:
        Parrot(string word, int num){
            this->words.push_back(word);
            number = num;
        }

    void changeWord(string word, int num){
        number = num;
        words.push_back(word);
    }

    void say(){
        srand(time(0));
        int k = rand()%words.size();
        for(int i = 0 ;i < number; i++){
            cout << words[k] << endl;
        }
    }
};

int main(){
    Parrot p("aaa", 2);
    p.say();
    p.changeWord("zzz", 3);
    p.say();
    return 0;
}