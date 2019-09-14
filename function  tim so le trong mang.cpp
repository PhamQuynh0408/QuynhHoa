#include <stdio.h>

void CacSoLeTrongMang(int a[],int n){
	for(int i=0;i<n;++i){
		if(a[i]%2==1){
			printf("cac so le trong mang la:%d\n",a[i]);
		}
		
	}
}
int main(){
	int a[10]={1,2,3,4,5,6,7,8,9,10};
	int n;
	CacSoLeTrongMang(a,n);
	return 0;
}

