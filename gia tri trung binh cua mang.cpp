#include <stdio.h>
int main(){
	int ary[12];
	int tong=0;
	
	for (int i=0; i<12 ; ++i){
		scanf("%d",&ary[i]);
		tong = tong + ary[i];
	}
	float giatritrungbinh;
	 giatritrungbinh = (float) tong/12;
	  printf("gia tri trung binh cua mang:%f",giatritrungbinh);
	return 0;
}
