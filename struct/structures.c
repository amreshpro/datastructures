#include <stdio.h>
#include<string.h>

struct student
{
   int rollNo ;
   char name[20];
   char course[20];
   float fees;
};

//  inser , read , display
int main(){

    struct student stu; // stud object
    struct student stu2;

    stu.rollNo = 1;
    // stu.name = "";
    // {'A','M','R','E','S','H'};
    strcpy(stu.name,"Amresh");
    strcpy(stu.course,"MCA");

    stu.fees = 100000;
    
    stu2 = stu;

    // stu.name = "Akash";
    int a = 10;
    a = 35;
    a = 353;
    
    strcpy(stu.name,"Akash");
    printf("rollNo. : %d, name: %s, course: %s, fees: %.2f",stu.rollNo,stu.name,stu.course,stu.fees);
    printf("\n");
    printf("rollNo. : %d, name: %s, course: %s, fees: %.2f",stu2.rollNo,stu2.name,stu2.course,stu2.fees);

    return 0;
}
