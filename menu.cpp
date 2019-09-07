#include <stdio.h>
int main(){
	int n;
	printf("menu:\n");
	printf("1.cafe\n");
	printf("2.sinh to\n");
	printf("3.nuoc ep\n");
	scanf("%d",&n);
	
      for(;n>3;){
      	printf("nhap lai\n");
      	scanf("%d",&n);
	  }
	  
	  switch(n){
	  	 case 1:printf("cafe\n");break;
	  	 case 2:printf("sinh to\n");break;
	  	 case 3:printf("nuoc ep\n");break;
	  	 default:;break;
	  }
	
	return 0;
}
