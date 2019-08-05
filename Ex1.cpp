#include <stdio.h>
#include <stdlib.h>

int calculaFatRec(int n);
int main(){
	
	int n;	
	printf("Digite um numero:\n");	
	scanf("%d" , &n);
	printf("O fatorial de %d e: %d", n, calculaFatRec(n));
		
	return (0);
	
}

int calculaFatRec(int n){
	if (n == 1 || n == 0){
		return 1;
		
	}else
	{
		return calculaFatRec(n - 1)*n;
		
	}
	
	
}
