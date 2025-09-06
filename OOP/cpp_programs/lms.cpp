#include <iostream>
#include <string>
#include <vector>
#include <iomanip>
using namespace std;
class Library {
public:
vector <string> allbooks = {"The Hobbit" , "A Red Eye" , "The Alchemist" , "Arkenfarer" , "The Magna Carta"};
vector <string> availbooks = {};
vector <string> borrowedbooks = {};

void see_books();
void get_book();
void return_book();


};
void Library::see_books() {
for (int i = 0 ; i < allbooks.size() ; i++) {
    cout << "[ " << i + 1 << " ] " << allbooks[i] << endl;
}
}
class Member {
public:
    //struct biodata{;
        string name;
        string email;
        int cnic;
        int DOB;

string username;
int date_of_reg;
string status;

vector <string> books;


void signup();
void signin();
void interface();

void portal();
void getbook();
void return_book();
void see_borowd_books();
//void see_all_books();
};
void Member::portal() {
cout << "Welcome to ZAFAR IQBAL LIBRARY : " << endl;
cout << endl << "What action you want to perform : " << endl;
cout << "1: See all books in Library\n2: See available books\n3: Borrow a book\n4: Return a book\n";
int option;
cout << endl << "Enter a number : ";
cin >> option;
switch (option) {
case 1:
    Library *lptr = new Library;
    lptr -> see_books();
    break;
}
}
void Member::interface() {
string choice;
cout << "Do you have an account (yes/no) : ";
cin >> choice;
if (choice == "yes") {
    signin();
    cout << endl << setw(50) << setfill('=') << "=" << endl;
    portal();

} else if (choice == "no") {
    signup();
}

}
void Member::signin(){
string fusername , femail;
cout << "Enter your username : ";
cin >> fusername;
cout << "Enter your email: ";
cin >> femail;
if (fusername == username && femail == email) {
    cout << "Access Granted";
} else {
cout << "Access Denied";
}
}
void Member::signup(){
cin.clear();
cin.ignore();
cout << "Enter your name : " << endl;
getline(cin , name);
cout << "Enter an username : " << endl;
cin.clear();
cin >> username;
cout << "Enter your CNIC : " << endl;
cin >> cnic;
cout << "Enter your email : " << endl;
cin >> email;
cout << "Enter your Date of Birth (MMDDYYYY)" << endl;
cin >> DOB;

}
int main(){
//cout << "Working" << endl;
Member m1;
m1.username = "athar";
m1.email = "atharmail";
//m1.signup();
//m1.signin();
m1.interface();
Library zia;
//zia.see_books();
return 0;
}
