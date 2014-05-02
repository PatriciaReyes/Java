/*
#include <stdio.h>

int main() {
  FILE *file;  // declare a FILE pointer 

  file = fopen("/preg/06-40159/SO/writing.txt", "w"); 
  // create a text file for writing 

  if(file==NULL) {
    printf("Error: can't create file.\n");
    // fclose(file); DON'T PASS A NULL POINTER TO fclose !! 
    return 1;
  }
  else {
    printf("File created. Now closing it...\n");
    fclose(file);
    return 0;
  }
}
*/

#include <stdio.h>
#include <stdlib.h> 

typedef struct robot ROBOT;

struct robot { 
  char *name; 
  int energy; 
};

int main() {
    int i;
    FILE *file;      /* FILE pointer */
    ROBOT robots[3];
    char fila[2];
    char columna[2];
    char str[50];

    file = fopen("temp.txt", "w"); /* create a file for writing */
    rename("temp.txt","hola.txt");

    if(file==NULL) {
    printf("An error has occurred.\n");
    return 1;
    }

    robots[0].name = "Lunar Lee";
    robots[0].energy = 50;
    robots[1].name = "Planetary Pete";
    robots[1].energy = 20;
    robots[2].name = "Martian Matt";
    robots[2].energy = 30;

    /* now loop through the robots array and print  
     the data into a text file pointed to by file */

    for(i=0 ; i<3 ; i++) {
    fprintf(file, "Robot %d is called %s ", i, robots[i].name);
    fprintf(file, "and has %d units of energy.\n", robots[i].energy);
    }

    for (i = 0; i<8; i++){
        sprintf (fila, "%d", i+1);
        sprintf (columna, "%d", i);
        strcat(str, "(");
        strcat(str, fila);
        strcat(str, ",");
        strcat(str, columna);
        strcat(str, ") ");
    }
    printf("%s\n",str);

    /* here is the old loop
    for(i=0 ; i<3 ; i++) {
    printf("Robot %d is called %s ", i, robots[i].name);
    printf("and has %d units of energy.\n", robots[i].energy);
    } */

    fclose(file); /* now close the file */
    return 0;
}