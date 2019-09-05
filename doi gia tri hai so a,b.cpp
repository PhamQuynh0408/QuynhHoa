#include <stdio.h>
int main(){
	
	int a,b,x;
	scanf("%d",&a);
	scanf("%d",&b);
	
	x=a;
	a=b;
	printf("a=%d\n",a);
	b=x;
	
	printf("b=%d\n",b);
	
	return 0;
}
