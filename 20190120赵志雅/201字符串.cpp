#include"stdio.h"
main()
{int a[5]={0},i,j=0,k;
for(i=0;i<5;i++)
printf("%d",a[i]);
printf("\n");
while(1) 
	{for(k=0;k<5;k++)
	if(a[k]!=1)break;
	if(k==5) break;
	j=0; 
	while(a[4-j]==1)
			{a[4-j]=0;j++;
			}
	a[4-j]=1;
	for(i=0;i<5;i++)
printf("%d",a[i]);
printf("\n");
	}
}
