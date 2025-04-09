#include <stdio.h>
#include <string.h>

struct Student
{
    int rollNo;
    char name[20];
    char course[20];
    float fees;
};

// read , display

void display(struct Student stu)
{
    printf("\n ------- Sudent Details ------- \n");
    printf("rollNo. : %d, name: %s, course: %s, fees: %f", stu.rollNo, stu.name, stu.course, stu.fees);
}

struct Student setStudent(struct Student stu)
{

    printf("\nEnter rollNo: ");
    scanf("%d", &stu.rollNo);

    printf("\nEnter name: ");
    scanf("%s", &stu.name);

    printf("\nEnter course: ");
    scanf("%s", &stu.course);

    printf("\nEnter fees: ");
    scanf("%f", &stu.fees);

    return stu;
}


int main(){

    struct Student student;
    // a = a +5; 
    student = setStudent(student);
    display(student);
    return 0;
}