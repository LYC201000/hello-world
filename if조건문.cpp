#include "stdafx.h"
#include "string.h"
int main() {

/*
���Ǻ� if��, 3�׿���
*/
	int num1 = 77;
	int num2 = 77;
	int max =0; 
	/*
	if(���ǽ�)
		true��:
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

	printf("�μ� �߿��� ū��:%d\n",max);


        return 0;
}