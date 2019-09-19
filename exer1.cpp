#include <stdio.h>
int main(){
	int n,s;
	printf("nhap n:\n");
	scanf("%d",&n);
	for( ;n!=0; ){
		s += n%10;
		n /= 10;
	}
	printf("tong cac chu so cua so tren la : %d",s);
	return 0;
}
