#include<stdio.h>
int main()
{
	int a[5]={0};
	for(int i=0;i<32;i++)
	{
		for(int j=0;j<5;j++)
			printf("%d",a[j]);
		a[4]++;
		for(int j=4;j>=0;j--)
		{
			if(a[j]>1)
			{
				a[j]=0;
				a[j-1]++;
			}
		}
		printf("\n");
	}
	return 0;
}
