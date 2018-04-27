#include "stdafx.h"
#include "string.h"
int main() {

/*
조건비교 if문, 3항연산
*/
	int num1 = 77;
	int num2 = 77;
	int max =0; 
	/*
	if(조건식)
		true값:
		*/
	if (num1 > num2)
		max = num1;
	else if (num2 > num1)
		max = num2;
	else
		max = 201000;

	//if (num2 > num1)
		//max = num2;
	//int max= (number1 > number2) ? number1 : number2;

	printf("두수 중에서 큰수:%d\n",max);


        return 0;
}