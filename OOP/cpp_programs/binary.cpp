#include <iostream>
#include <fstream>
using namespace std;
void output_matrix(int arr[][3]);
int main() {
int pixels[3][3];
for (int i = 0 ; i < 3 ; i++) {
    for(int j = 0 ; j < 3 ; j++) {
        pixels[i][j] = 1 + i*j;
    }
}
output_matrix(pixels);
ofstream fout("data.bin" , ios::binary);
if (!fout) {
    cout << "Unable to create file" << endl;
} else {
    for (int i = 0 ; i < 3 ; i++) {
    for(int j = 0 ; j < 3 ; j++) {
    fout.write((char*)&pixels[i][j] , sizeof(int));
       }
}
}
fout.close();
cout << "Resetting pixels" << endl;
for (int i = 0 ; i < 3 ; i++) {
    for(int j = 0 ; j < 3 ; j++) {
       pixels[i][j] = 0;
    }
}
output_matrix(pixels);
cout << "Reading Files" << endl;
ifstream fin("data.bin" , ios::binary);
if (!fin) {
    cout << "Unable to open file" << endl;
} else {
    for (int i = 0 ; i < 3 ; i++) {
    for(int j = 0 ; j < 3 ; j++) {
    fin.read((char*)&pixels[i][j] , sizeof(int));
       }
}
}
fin.close();
output_matrix(pixels);
return 0;
}
void output_matrix(int arr[][3]) {
for (int i = 0 ; i < 3 ; i++) {
    for(int j = 0 ; j < 3 ; j++) {
        cout << arr[i][j] << "   ";
    }
    cout << endl;
}
}
