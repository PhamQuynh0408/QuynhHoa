#include <stdio.h>
#include <string.h>
void LowerCase( char str[50]){
	for(int i =0;i<=strlen(str); ++i){
 	if(str[i]>=65 && str[i]<=90){
 		printf("%c",str[i]+32);
	 }
	 else{printf("%c",str[i]);
	 }
 }
}
int main(){
	char str[50];
	printf("nhap chuoi:\n");
	scanf("%s",str);
	LowerCase(str);
	
return 0;
}
