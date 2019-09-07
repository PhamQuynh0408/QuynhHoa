#include <stdio.h>
int main(){
	int n, soChuSo = 0;
	scanf("%d",&n);
	 
	for(;n>0;) {
		n=n/10;
		 if(n>=0){
		 	soChuSo ++;
		 }
			
	}
	printf("So chu so cua n la : %d\n",soChuSo);
	return 0;
}
