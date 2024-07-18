// How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
// program to solve the above problem. 

import java.util.Scanner;
class Stack{
    char s[];
    int top;
    int size;
    public Stack(int size){
        this.size = size;
        s = new char[size];
        top = -1;
    }
}
