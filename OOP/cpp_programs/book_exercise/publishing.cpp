#include <iostream>
#include "dates"
using namespace std;
class sales
{
private:
    float three_sales[3];
public:
    void get_data();
    void show_data() const;
};
void sales::get_data()
{
    cout << "\nPlease enter data for last 3 months sale (3rd being the latest)\n";
    cout << "[1] : "; cin >> three_sales[0];
    cout << "[2] : "; cin >> three_sales[1];
    cout << "[3] : "; cin >> three_sales[2];
}
void sales::show_data() const
{
    cout << "\nLast 3 months sale : \n";
    cout << "Month 1 : " << three_sales[0] << '$' << endl;
    cout << "Month 2 : " << three_sales[1] << '$' << endl;
    cout << "Month 3 : " << three_sales[2] << '$' << endl;
}
class publication
{
private:
    string title;
    float price;
    dates dopub;
public:
    void get_data ();
    void show_data () const;
};
void publication::get_data()
{
    cout << "Please enter title : "; cin >> title;
    cout << "Please enter price : "; cin >> price;
    cout << "Please enter Date of Publication : ";
    dopub.getdate();
}
void publication::show_data() const
{
    cout << "Title : " << title << endl;
    cout << "Price : " << price << endl;
}
class book : private publication , private sales
{
    int pagecount;
public:
    void get_data();
    void show_data();
};
void book::get_data()
{
    cout << "Book Data Entry : " << endl;
    cout << "====================================" << endl;
    publication::get_data();
    cout << "Please enter Page Count : "; cin >> pagecount;
    sales::get_data();
}
void book::show_data()
{
    cout << "\nBook Data\n";
    cout << "====================================" << endl;
    publication::show_data();
    cout << "Page Count of book : " << pagecount;
    sales::show_data();
}
class tape: private publication , private sales
{
private:
    float playtime;
public:
    void get_data();
    void show_data();
};
void tape::get_data()
{
     cout << "\nTape Data Entry : " << endl;
     cout << "====================================" << endl;
     publication::get_data();
     cout << "Please enter playtime : "; cin >> playtime;
     sales::get_data();
}
void tape::show_data()
{
    cout << "\nTape Data : " << endl;
    cout << "====================================" << endl;
    publication::show_data();
    cout << "Playtime of tape : " << playtime << endl;
    sales::show_data();

}
class disk : private publication
{
 private:
    enum dtype {cd = 1, dvd};
    dtype dsktyp;
public:
    void get_data();
    void show_data();
};
void disk::get_data()
{

     cout << "\nDisk Data Entry : " << endl;
     cout << "====================================" << endl;
     publication::get_data();
     char ch;
     cout << "Please enter disk type (c for cd , d for dvd) : ";
     cin >> ch;
     if (ch == 'c')
        dsktyp = dtype(1);
     else
        dsktyp = dtype(2);
}
void disk::show_data()
{
    cout << "\nDisk Data : " << endl;
    cout << "====================================" << endl;
    publication::show_data();
    cout << "Type of disk : ";
    switch (dsktyp)
    {
        case 1: cout << "CD\n"; break;
        case 2: cout << "DVD\n"; break;
    }
}
int main()
{

    book b1;
    b1.get_data() ;
    b1.show_data();
    cout << endl;
    tape t1;
    t1.get_data();
    t1.show_data();
    cout << endl;
    disk d1;
    d1.get_data();
    d1.show_data();
    return 0;
}
