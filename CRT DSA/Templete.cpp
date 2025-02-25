#include<iostream>
#include<stdio.h>
using namespace std;
template<class T>
T Max(T t1, T t2) {
    return t1>t2?t1:t2;
}

int main()
{
    int a, b;
    cin>>a>>b;
    cout<<Max(a,b)<<endl;
    float c, d;
    cin>>c>>d;
    cout<<Max(c,d);

}
