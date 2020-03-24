# 608_TicTacToe

## Aufgabe:
Realisiere das Spiel Tic-Tac-Toe in C.

Gegeben ist folgendes Code-Grundgerüst:
``` C
#include <stdio.h>

#define MAX_ARENA 3

void init_arena(char area[MAX_ARENA][MAX_ARENA]);
void print_arena (char area[MAX_ARENA][MAX_ARENA]);
void print_player_info(int move);
void player_input (int move, char arena[MAX_ARENA][MAX_ARENA]);
int check_for_win (int move, char arena[MAX_ARENA][MAX_ARENA]);

int main ()
{
	char arena[MAX_ARENA][MAX_ARENA];
	int moves = 0;
	int won = 0;

	init_arena(arena);
	printf ("WELCOME TO TIC-TAC-TOE!\n\n");
	
	do {
		print_player_info (moves);
		player_input(moves, arena);
        print_arena(arena);
        won = check_for_win(moves, arena);
		moves++;
	} while ((moves < MAX_ARENA * MAX_ARENA) && !won);
	
	if (moves == MAX_ARENA * MAX_ARENA) printf ("Draw! No winner this time!\n");
	return 0;
}
```

Erweiter das obige Grundgerüst zu einer lauffähigen Version!

Beispiel der Ausgabe:
``` C
Example Output:

Player 2, your move (X/Y):
x = 2
y = 2

 X | O | O
---+---+---
 O | X |
---+---+---
   |   | X
Gratulations! Player 2, you won!
```
