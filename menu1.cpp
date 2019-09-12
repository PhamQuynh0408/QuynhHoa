#include <stdio.h>

int main (){
	int n,a,b;
    do{
    	printf("Xin Quy Khach Chon Cac Muc Sau:\n");
	    printf("1.chon mon an\n");
	    printf("2. do uong\n");
	    printf("3.Thanh toan\n");
	    printf("4.Thoat\n");
	    scanf("%d",&n);
	    switch (n)
		{
	        case 1:
	        printf("1.Com ga\n");
	        printf("2.Bun\n");
	        printf("3.Pho\n");
	        printf("4.Quay lai\n");
	        printf("moi chon mon:");
	        scanf("%d",&a);
	        switch(a){
	            case 1: printf ("Cam on da chon mon com ga, xin doi\n");break;
	            case 2:printf ("Cam on da chon mon bun,xin doi\n");break;
	            case 3:printf ("Cam on da chon mon pho,xin doi\n");break;
	        }
	        break;
	
	        case 2:
	        printf("==================MENU================\n");
	        printf("1.Nuoc cam\n");
	        printf("2.Sinh to\n");
	        printf("3.Cafe\n");
	        printf("4.Quay lai\n");
	        printf("moi chon mon:");
	        scanf("%d",&b);
	        switch(b){
	            case 1: printf ("Cam on da chon nuoc cam,xin doi\n ");break;
	            case 2:printf ("Cam on da chon sinh to,xin doi\n ");break;
	            case 3:printf ("Cam on da chon cafe,xin doi\n");break;
	    	}
	    	break;	
	        case 3: printf ("vui long doi de lay hoa don,cam on quy khach da chon dich vu cua chung toi\n");break;
	        break;
			case 4:  break;
	
	    }
	}while (n!=4);
    
	return 0;
}
