#include "LETTER.h"
#include "console.h"
#include<iostream>
using namespace std;

LETTER::LETTER()
{

}

LETTER::LETTER(char C)
{
	c = C;
	To_Big_char();
}

LETTER::LETTER(char C, int i)
{
	c = C;
	To_unikey();
}

void LETTER::To_Big_char()
{
	switch(c)
	{
	case '=':
	{
		char C[9][15]={
			"              ", 
			"              ",  
			"              ",  
			"   =======    ",   
			"   =======    ",
			"              ",
			"              ",
			"              ",
			"              "};

		for(int k = 0; k<9; k++)
			for(int j = 0; j<15; j++)
			{
				letter[k][j] = C[k][j];
			}
		break;
	}
	case 'd':
		{
			char C[9][15]={
				" a111111111c  ", 
				"a1c	  ad33b",  
				"a1c	  ad33b",  
				"a1c	  ad33b",   
				"a1c	  ad33b",
				"a1c	  ad33b",
				"a1c	  ad33b",
				"a1c	  ad33b",
				"bc211111111c  "};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 't':
	{
		char C[9][15]={
			"ad3a11c11a1133", 
			"ad3a11c11a1133",  
			"     2332     ",  
			"     2332     ",   
			"     2332     ",
			"     2332     ",
			"     2332     ",
			"     2332     ",
			"     2332     "};

		for(int k = 0; k<9; k++)
			for(int j = 0; j<15; j++)
			{
				letter[k][j] = C[k][j];
			}
		break;
	}
	case 'i':
		{
			char C[9][15]={
				"   11c11a11   ", 
				"   11c11a11   ",  
				"     2332     ",  
				"     2332     ",   
				"     2332     ",
				"     2332     ",
				"     2332     ",
				"   11c11a11   ",
				"   11c11a11   "};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'b':
		{
			char C[9][15]={
				" a111111111c  ", 
				"a1c	  ad3a1",  
				"232     ad3a1 ",  
				"232   11111d  ",   
				"232   11111d  ",
				"232      23332",
				"232      23332",
				"232      23332",
				"bc21111111111c"};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'h':
		{
			char C[9][15]={
				"a11c    a1111c", 
				"2332    233332",  
				"2332    233332",  
				"233b1111d33332",   
				"233a1111c33332",
				"2332    233332",
				"2332    233332",
				"2332    233332",
				"b11d    b1111d"};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'a':
		{
			char C[9][15]={
				"  a1111111c   ", 
				" ad3a11c33b1c ",  
				"ad33b11d3333bc",  
				"23333333333332",
				"233a1111c33332",
				"2332    233332",
				"2332    233332",
				"2332    233332",
				"b11d    b1111d"};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'p':
		{
			char C[9][15]={
				"a111111111c   ", 
				"23a111111cb1c ",  
				"23b111111d33bc",  
				"233333333333ad",   
				"233e11111111d ", 
				"2332          ", 
				"2332          ", 
				"2332          ", 
				"b11d          "};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'y':
		{
			char C[9][15]={
				"1ca1    1c11a1",
				" 22      2332 ", 
				" 22      2332 ",
				" 22      231d ",  
				"  b1g11g1d    ",
				"    2332      ", 
				"    2332      ",
				"    2332      ", 
				"   1h11h1     "};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'n':
		{
			char C[9][15]={
				"a11c    a1111c",
				"233bc   233332", 
				"2333bc  233332",
				"23abcbc 233332",  
				"232 bcbc233332",
				"232  bcbd33332", 
				"232   bc 33332",
				"232    bc33332", 
				"b1d     b1111d"};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'e':
		{
			char C[9][15]={
				"a11111111111c ",
				"233a11111111d ", 
				"2332          ",
				"233b11c       ",  
				"233a11d       ",
				"2332          ", 
				"233b111111111c",
				"23333333333332", 
				"b111111111111d"};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'w':
		{
			char C[9][15]={
				"a1c      a111c",
				"232      23332", 
				"232      23332",
				"232      23332",
				"232 ac   23332",
				"232 22   23332", 
				"232 22   23332",
				"bc2 22   23a1d",
				" bh1hh111h1d  "};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	case 'r':
		{
			char C[9][15]={
				"a111111111c   ", 
				"23a111111cb1c ",  
				"23b111111d33bc",  
				"233333333333ad",   
				"233e11g3g111d ", 
				"2332  bcb1c   ", 
				"2332   bc3bc  ", 
				"2332    bc3bc ", 
				"b11d     b11d "};

			for(int k = 0; k<9; k++)
				for(int j = 0; j<15; j++)
				{
					letter[k][j] = C[k][j];
				}
			break;
		}
	}
}

void LETTER::To_unikey()
{
	switch(c)
	{
	case 'e':
	{
		char C[4][5] = { 
			"21cc",  
			"e1c ",  
			"2   ",
			"2e1c",};

		for(int k = 0; k<4; k++)
			for(int j = 0; j<4; j++)
			{
				letter_uni[k][j] = C[k][j];
			}
		break;
	}
	case 'p':
	{
		char C[4][5] = {
			"    ", 
			"21c ",  
			"e1  ",  
			"2   "};

		for(int k = 0; k<4; k++)
			for(int j = 0; j<4; j++)
			{
				letter_uni[k][j] = C[k][j];
			}
		break;
	}
	case 'h':
		{
			char C[4][5] = {
				"2   ", 
				"2   ",  
				"e1c ",  
				"2 2 "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'm':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				"agc ",  
				"222 "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'n':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				"a1c ",  
				"2 2 "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'o':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				"a1g ",  
				"b1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'O':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				"a1gd",  
				"b1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'i':
		{
			char C[4][5] = {
				"    ", 
				" d  ",  
				"1c  ",  
				"1h1 "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'j':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				" o  ",  
				"    "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 't':
		{
			char C[4][5] = {
				"    ", 
				" 2  ",  
				" i  ",  
				" bd "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'a':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				"a1c ",  
				"b1h "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'c':
		{
			char C[4][5] = {
				"    ", 
				"    ",  
				"a11 ",  
				"b11 "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'g':
		{
			char C[4][5] = {
				"    ", 
				"a1c ",  
				"b1j ",  
				" 1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'k':
		{
			char C[4][5] = {
				"2   ",  
				"2a  ",  
				"ej  ",
				"2b1 " };

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'v':
		{
			char C[4][5] = {
				"    ",  
				"c   ",  
				"2 a ",
				"b1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'u':
		{
			char C[4][5] = {
				"    ",  
				"    ",  
				"c ad",
				"b1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 's':
		{
			char C[4][5] = {
				"    ",  
				"a1  ",  
				"b1c ",
				"11d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'y':
		{
			char C[4][5] = {
				"    ",  
				"c a ",  
				"b1j ",
				" 1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'w':
		{
			char C[4][5] = {
				"    ",  
				"    ",  
				"    ",
				"b1d "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'z':
		{
			char C[4][5] = {
				"    ",  
				"    ",  
				"    ",
				"1d  "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'f':
		{
			char C[4][5] = {
				"    ",  
				"    ",  
				"    ",
				"b1  "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	case 'q':
		{
			char C[4][5] = {
				"    ",  
				"    ",  
				"    ",
				"a1c "};

			for(int k = 0; k<4; k++)
				for(int j = 0; j<4; j++)
				{
					letter_uni[k][j] = C[k][j];
				}
			break;
		}
	}
}

void LETTER::Draw(int x,int  y, int color)
{
	int i = 9, j = 15;
	int _x = x;
	for(int _i = 0; _i<i; _i++)
	{
		for(int _j = 0; _j < j; _j++)
		{
			TextColor(color);
			gotoXY(x, y);
			if(letter[_i][_j] == '1') letter[_i][_j] = 205;
			else if(letter[_i][_j] == '2') letter[_i][_j] = 186;
			else if(letter[_i][_j] == 'a') letter[_i][_j] = 201;
			else if(letter[_i][_j] == 'b') letter[_i][_j] = 200;
			else if(letter[_i][_j] == 'c') letter[_i][_j] = 187;
			else if(letter[_i][_j] == 'd') letter[_i][_j] = 188;
			else if(letter[_i][_j] == 'e') letter[_i][_j] = 204;
			else if(letter[_i][_j] == 'f') letter[_i][_j] = 185;
			else if(letter[_i][_j] == 'g') letter[_i][_j] = 203;
			else if(letter[_i][_j] == 'h') letter[_i][_j] = 202;
			else if(letter[_i][_j] == '3') letter[_i][_j] = 219;
			
			
			putchar(letter[_i][_j]);

			x++;
		}
		x = _x;
		y++;
	}
}

void LETTER::draw_uni(int x , int y, int color)
{
	int i = 4, j = 4;
	int _x = x;
	for(int _i = 0; _i<i; _i++)
	{
		for(int _j = 0; _j < j; _j++)
		{
			TextColor(color);
			gotoXY(x, y);
			if(letter_uni[_i][_j] == '1') letter_uni[_i][_j] = 205;
			else if(letter_uni[_i][_j] == '2') letter_uni[_i][_j] = 186;
			else if(letter_uni[_i][_j] == 'a') letter_uni[_i][_j] = 201;
			else if(letter_uni[_i][_j] == 'b') letter_uni[_i][_j] = 200;
			else if(letter_uni[_i][_j] == 'c') letter_uni[_i][_j] = 187;
			else if(letter_uni[_i][_j] == 'd') letter_uni[_i][_j] = 188;
			else if(letter_uni[_i][_j] == 'e') letter_uni[_i][_j] = 204;
			else if(letter_uni[_i][_j] == 'f') letter_uni[_i][_j] = 185;
			else if(letter_uni[_i][_j] == 'g') letter_uni[_i][_j] = 203;
			else if(letter_uni[_i][_j] == 'h') letter_uni[_i][_j] = 202;
			else if(letter_uni[_i][_j] == 'i') letter_uni[_i][_j] = 206;
			else if(letter_uni[_i][_j] == 'j') letter_uni[_i][_j] = 185;
			
			putchar(letter_uni[_i][_j]);

			x++;
		}
		x = _x;
		y++;
	}
}
