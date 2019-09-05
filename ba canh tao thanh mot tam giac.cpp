#include <stdio.h>
#include <math.h>
int main(){
	 int  a,b,c,P,p,s;
	 scanf("%d",&a);
	 scanf("%d",&b);
	 scanf("%d",&c);
	 
	 if(a+b>c && a+c>b && b+c>a){
	 	printf("day la ba canh cua tam giac");
	 		int P = a+b+c;
	 	printf("chu vi : P = %d\n",P);
	 		float p = (float) P/2;
	 	    float s = 0;
	 	    s = sqrt(p*(p-a)*(p-b)*(p-c));
	 	printf("dien tich : s = %f\n",s);
	 }

	 	else{
	 		printf("day khong phai ba canh cua tam giac\n");
		 }
	 	
	    return 0;
		 }

