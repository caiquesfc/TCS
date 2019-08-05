#include <stdio.h>

main()

{

int x,y;
printf("1234\n");
for(y=0;y<4;y++){

for(x=0;x<4;x++)

if((x+y)%2==0)

printf("00");

else

printf("");

printf("\n");


}

}
