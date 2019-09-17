#include <stdio.h>
#include <string.h>
int main(){
	int a[5];
	printf("nhap mang:\n");
	for (int i=0;i<5;++i){
		char str1[10];
		printf("nhap chuoi trong mang:\n");
		for(int j=0;j<10;++j){
			scanf("%s",str1);
			printf("nhap chuoi can kiem tra");
			char str2[10];
			scanf("%s",str2);
			for(int i=0;i<5;++i){
				for(int j=0;j<10;++j){
					if(strcmp(str1,str2)==0){
						printf("chuoi khong thuoc mang");
						break;
					}
				}
			}
		}
	}
	
	
	
	return 0; }
