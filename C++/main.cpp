#include<iostream>
#include<conio.h>
#include"console.h"
#include<Windows.h>
#include <mmsystem.h>
#include<time.h>
#include<stdlib.h>
#include"NUMBER.h"
#include"FIREWORK.h"
#include"LETTER.h"
using namespace std;

void gift();

const int X = 35;
const int Y = 8;

void resizeConsole(int width, int height) {
	HWND console = GetConsoleWindow();
	RECT r;
	GetWindowRect(console, &r);
	MoveWindow(console, r.left, r.top, width, height, TRUE);
}

void Count_down()
{
	srand(time(NULL));
	int color;
	NUMBER _0(0), _1(1), _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8), _9(9);
	color = 9 + rand() % (16-9);
	_1.Draw(9, 15, X, Y, color);
	_0.Draw(9, 15, X+22, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_9.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_8.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_7.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_6.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_5.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();
	
	color = 9 + rand() % (16-9);
	_4.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_3.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_2.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_1.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();

	color = 9 + rand() % (16-9);
	_0.Draw(9, 15, X+15, Y, color);
	Sleep(1100);
	clrscr();
}

void Happy(int color)
{
	LETTER h('h'), a('a'), p('p'), y('y');

	h.Draw(X-21, Y - 5, color);
	a.Draw(X-6, Y - 5, color);
	p.Draw(X+10, Y - 5, color);
	p.Draw(X+26, Y - 5, color);
	y.Draw(X+41, Y - 5, color);

	
}

void Birthday(int color)
{
//	LETTER n('n'), e('e'), w('w'), r('r');
//
//	n.Draw(X-32, Y+7, color);
//	e.Draw(X-16, Y+7, color);
//	w.Draw(X, Y+7, color);

	LETTER b('b'), i('i'), r('r'), t('t'), h('h'), d('d'), a('a'), y('y');

	b.Draw(X-30, Y + 7, color);
	i.Draw(X-15, Y + 7, color);
	r.Draw(X- 0, Y + 7, color);
	t.Draw(X+15, Y + 7, color);
	h.Draw(X+30, Y + 7, color);
	d.Draw(X+45, Y + 7, color);
	a.Draw(X+65, Y + 7, color);
	y.Draw(X+85, Y + 7, color);
}

void Year(int color)
{
	LETTER y('y'), e('e'), a('a'), r('r');

	y.Draw(X+18, Y+7, color);
	e.Draw(X+34, Y+7, color);
	a.Draw(X+50, Y+7, color);
	r.Draw(X+66, Y+7, color);
}

void Nam_moi_thanh_cong(int color)
{
//	LETTER k('k',1), v('v', 1), u('u',1), s('s',1), y('y',1), n('n',1), m('m',1), a('a',1), c('c',1), g('g',1), h('h',1), w('w',1), O('O',1), z('z',1);
//	LETTER i('i',1) , t('t',1), f('f',1), o('o',1), q('q',1), p('p', 1), e('e', 1), u('u', 1), c('c', 1), v('v',1);

//	n.draw_uni(X-25, Y-7, color);
//	a.draw_uni(X-22, Y-7, color);
//	w.draw_uni(X-22, Y-9, color);
//	m.draw_uni(X-19, Y-7, color);
//
//	m.draw_uni(X-14, Y-7, color);
//	O.draw_uni(X-11, Y-7, color);
//	z.draw_uni(X-11, Y-9, color);
//	i.draw_uni(X-7, Y-7, color);
//
//	t.draw_uni(X-2, Y-7,color);
//	h.draw_uni(X+1, Y-7, color);
//	a.draw_uni(X+4, Y-7, color);
//	f.draw_uni(X+4, Y-9, color);
//	n.draw_uni(X+7, Y-7, color);
//	h.draw_uni(X+10, Y-7, color);
//
//	c.draw_uni(X+15, Y-7, color);
//	o.draw_uni(X+18, Y-7, color);
//	q.draw_uni(X+18, Y-9, color);
//	n.draw_uni(X+21, Y-7, color);
//	g.draw_uni(X+24, Y-6, color);

	LETTER h('h', 1), a('a', 1), n('n', 1), p('p', 1), u('u', 1), c('c', 1), v('v', 1), e('e', 1), j('j', 1), z('z', 1), i('i',1);

	h.draw_uni(X-25, Y-7, color);
	a.draw_uni(X-22, Y-7, color);
	j.draw_uni(X-22, Y-5, color);
	n.draw_uni(X-19, Y-7, color);
	h.draw_uni(X-16, Y-7, color);
	
	p.draw_uni(X-11, Y-7, color);
	h.draw_uni(X-8, Y-7, color);
	u.draw_uni(X-5, Y-7, color);
	z.draw_uni(X-5, Y-5, color);
	c.draw_uni(X-2, Y-7, color);
	
	v.draw_uni(X+3, Y-7, color);
	u.draw_uni(X+6, Y-7, color);
	i.draw_uni(X+9, Y-7, color);
	
	v.draw_uni(X+14, Y-7, color);
	e.draw_uni(X+17, Y-7, color);

}

void An_khang_thinh_vuong(int color)
{
	LETTER k('k',1), v('v', 1), u('u',1), s('s',1), y('y',1), n('n',1), m('m',1), a('a',1), c('c',1), g('g',1), h('h',1), w('w',1), O('O',1), z('z',1);
	LETTER i('i',1) , t('t',1), f('f',1), o('o',1), q('q',1), j('j',1);

	a.draw_uni(X-25, Y, color);
	n.draw_uni(X-22, Y, color);

	k.draw_uni(X-17, Y,color);
	h.draw_uni(X-14, Y, color);
	a.draw_uni(X-11, Y, color);
	n.draw_uni(X-8, Y, color);
	g.draw_uni(X-5, Y+1, color);

	t.draw_uni(X, Y,color);
	h.draw_uni(X+3, Y, color);
	j.draw_uni(X+6, Y+2, color);
	i.draw_uni(X+6, Y, color);
	n.draw_uni(X+9, Y, color);
	h.draw_uni(X+12, Y, color);

	v.draw_uni(X+17, Y,color);
	u.draw_uni(X+20, Y, color);
	j.draw_uni(X+24, Y+2, color);
	O.draw_uni(X+24, Y, color);
	n.draw_uni(X+28, Y, color);
	g.draw_uni(X+32, Y+1, color);
}

void Van_su_nhu_y(int color)
{
	LETTER k('k',1), v('v', 1), u('u',1), s('s',1), y('y',1), n('n',1), m('m',1), a('a',1), c('c',1), g('g',1), h('h',1), w('w',1), O('O',1), z('z',1);
	LETTER i('i',1) , t('t',1), f('f',1), o('o',1), q('q',1), j('j',1);

	v.draw_uni(X-25, Y+7,color);
	j.draw_uni(X-22, Y+9,color);
	a.draw_uni(X-22, Y+7, color);
	n.draw_uni(X-19, Y+7, color);

	s.draw_uni(X-13, Y+7,color);
	j.draw_uni(X-10, Y+9,color);
	u.draw_uni(X-10, Y+7,color);

	n.draw_uni(X-5, Y+7,color);
	h.draw_uni(X-2, Y+7,color);
	u.draw_uni(X+1, Y+7,color);

	y.draw_uni(X+8, Y+8,color);
	z.draw_uni(X+8, Y+5,color);
}

void Firework()
{
	int color;
	char firework[19][42] = {                     //[14][]
		"            d  d  d    d                 ",
		"        d  d dd   d d d  d   dd          ",
		"   d d  d d d d d  c  dd  d d d d  d     ",
		" d  d  d d  d cdcdccddccc c d d  d  d    ",
		"d  d dd d  cdc ccdcdcdc c c cc d   d d   ",  //.  a  b  c  d
		" d d dd d cdccdcbd bd b dd c cc  d d  d  ",
		"d  d dd  cdcdcbdbabadbadbd cdcdc d d d   ",
		" d d d  ccc dbcbaccac.db b d c dc d d   d",
		"   d ddcdcdcb b.cca..adcdcb dd c  d d  d ",
		" d  d d cdc d bcb d|a dcdb c dc c  d d  d",
		" d d  d  cdcdb bcdc|  cbcbdd cdc  d  d   ",
		"  d d d ccdc dbdb c| bbd cdcdc d d  d d  ",
		" d d  d  cdcdcdc db|b d c cdc d  d d     ",
		"  d d d d c dcdccd |c dccdc    dd  d  d  ",
		"   d  d d d  dcd c |c c c d  d d  d d    ",
		"     d  d d d  d  d| d     d d  d        ",
		"        d     d  d |d  d   d  d          ",
		"          d d  d   |  d  d d             ",
		"                d  | d  d                "};
	
	srand(time(NULL));

	int color_h = 14;
	int color_n = 11;
	int color_y = 13;

	int count = 0;
	for(int i = 0; i<=5; i++)
	{
		int vitri = rand() % (70);
		Draw(firework, vitri);
		switch(count)
		{
		case 0:
			{	
				Happy(0);
				Sleep(80);
				Happy(color_h-8);
				Sleep(80);
				Happy(color_h);
				Sleep(300);
				Happy(color_h-8);
				Sleep(80);
				Happy(0);
				count++;
				break;
			}
		case 1:
			{	
				Birthday(0);
				Sleep(80);
				Birthday(color_n-8);
				Sleep(80);
				Birthday(color_n);
				Sleep(300);
				Birthday(color_n-8);
				Sleep(80);
				Birthday(0);
				count++;
				break;
			}
		case 2:
			{
				
				Happy(0); Birthday(0);
				Sleep(100);
				Happy(color_h-8); Birthday(color_n-8);
				Sleep(100);
				Happy(color_h); Birthday(color_n);
				Sleep(2000);
				Happy(color_h-8); Birthday(color_n-8);
				Sleep(100);
				Happy(0); Birthday(0);
				Sleep(100);
				count++;
				break;
			}
		case 3:
			{
				NUMBER _2(2), _3(3), _0(0), _4(4);
				_2.Draw(9, 15, X+5, Y, 0);
				_3.Draw(9, 15, X+21, Y, 0);
				_0.Draw(9, 15, X+37, Y, 0);
				_4.Draw(9, 15, X+53, Y, 0);

				Sleep(100);

				_2.Draw(9, 15, X+5, Y, 6);
				_3.Draw(9, 15, X+21, Y, 6);
				_0.Draw(9, 15, X+37, Y, 6);
				_4.Draw(9, 15, X+53, Y, 6);

				Sleep(100);

				_2.Draw(9, 15, X+5, Y, 14);
				_3.Draw(9, 15, X+21, Y, 14);
				_0.Draw(9, 15, X+37, Y, 14);
				_4.Draw(9, 15, X+53, Y, 14);

				Sleep(200);

				for(int k = 0; k<=40; k++)
				{
					color = 9 +rand() % (16-9);
					_2.Draw(9, 15, X+5, Y, color);
					color = 9 +rand() % (16-9);
					_3.Draw(9, 15, X+21, Y, color);
					color = 9 +rand() % (16-9);
					_0.Draw(9, 15, X+37, Y, color);
					color = 9 +rand() % (16-9);
					_4.Draw(9, 15, X+53, Y, color);
					Sleep(50);
				}
				
				_2.Draw(9, 15, X+5, Y, 14);
				_3.Draw(9, 15, X+21, Y, 14);
				_0.Draw(9, 15, X+37, Y, 14);
				_4.Draw(9, 15, X+53, Y, 14);

				Sleep(100);

				_2.Draw(9, 15, X+5, Y, 6);
				_3.Draw(9, 15, X+21, Y, 6);
				_0.Draw(9, 15, X+37, Y, 6);
				_4.Draw(9, 15, X+53, Y, 6);

				Sleep(100);

				_2.Draw(9, 15, X+5, Y, 0);
				_3.Draw(9, 15, X+21, Y, 0);
				_0.Draw(9, 15, X+37, Y, 0);
				_4.Draw(9, 15, X+53, Y, 0);

				Sleep(100);

				count++;
				break;
			}
		case 4:
			{
				gotoXY(X, Y);
				TextColor(0);
				cout<<"Sinh nhat vui ve nha co gai kim nguu <3 <3";
				Sleep(200);

				gotoXY(X, Y);
				TextColor(7);
				cout<<"Sinh nhat vui ve nha co gai kim nguu <3 <3";
				Sleep(400);

				gotoXY(X, Y);
				TextColor(15);
				cout<<"Sinh nhat vui ve nha co gai kim nguu <3 <3";
				Sleep(3000);

				gotoXY(X, Y);
				TextColor(7);
				cout<<"Sinh nhat vui ve nha co gai kim nguu <3 <3";
				Sleep(200);

				gotoXY(X, Y);
				TextColor(0);
				cout<<"Sinh nhat vui ve nha co gai kim nguu <3 <3";
				Sleep(100);
				
				count++;
				break;
			}
		case 5:
			{
				gift();
				break;
			}
		}
	}
}

void gift() {
	int i;
	TextColor(13);
	
	for(i = 1;i <= 100;++i)
	{
		system("cls");
		printf("\n\t\t\4\4\4\4...........................................\4\4\4\4");
		printf("\n\n\t\t\t\3\3Send from...........Your Duy\3\3");
		printf("\n\n\t\t\t     Sinh Nhat Vui Ve.. !!! \3\3\3");
		cout<<"\n\n\t\t\t\tLoading..."<< i << " %";
		printf("\n\n\t\t\4\4\4\4...........................................\4\4\4\4");
	
		if(i == 2)
		{
			printf("\n\n\n\t\t\t\t    \4\4 M \4\4");
			printf("\n\n\n\t      \3\3 Hom nay vao 20 nam truoc.. La ngay ha sinh 1 thien than.. \3\3");
			Sleep(5000);
		}
		if(i == 4)
		{
			printf("\n\n\n\t\t\t\t    \4\4 MI \4\4");
			printf("\n\n\n\t       \3 Mot ngay.. kha dac biet..");
			printf("\n\n\n\t      \3 Nen muon lam mot thu dac biet.. cho SN 20+..");
			Sleep(5000);
		}
		if(i == 9)
		{
			printf("\n\n\n\t\t\t\t    \4\4 MIS \4\4");
			cout << "\n\n\n\t\t   \3\3 Them tuoi, them nhieu niem vui, bot di noi buon !!";
			Sleep(5000);
		}
		if(i == 23)
		{
			printf("\n\n\n\t\t\t\t    \4\4 MISS \4\4");
			printf("\n\n\n\t\t    \3 Hay luon giu net Baby !!");
			printf("\n\n\n\t\t     \3 Nu cuoi troi cho !!");
			Sleep(5000);
		}
		if(i == 45)
		{
			printf("\n\n\n\t\t\t\t    \4\4 MISS M \4\4");
			printf("\n\n\n\t\t     \3 Hanh phuc ben gia dinh !!");
			cout << "\n\n\n\t\t      \3 Luon hanh phuc voi su lua chon cua minh !!";
			Sleep(5000);
		}
		if(i == 69)
		{
			printf("\n\n\n\t\t\t\t    \4\4 MISS ME \4\4");
			printf("\n\n\n\t\t     \3 Xinh roi.. Nghe nhieu roi.. Khoi chuc !!");
			printf("\n\n\n\t\t      \3 Tuoi moi an mau chong lon !!");
			Sleep(5000);
		}
		if(i == 86)
		{
			printf("\n\n\n\t\t\t        \4\4 MISS ME FORE \4\4");
			printf("\n\n\n\t\t\t  \3 Chieu kho doc day... Het roi !!!");
			printf("\n\n\n\t\t\t    \4\4 HAPPY BIRTHDAY \4\4");
			Sleep(5000);
		}
		if(i == 100)
		{
			printf("\n\n\n\t\t\t        \4\4 MISS ME FOREVER \4\4");
			printf("\n\n\n\t\t\t  \3 QUA MUON.. THONG CAM NHA !!!\n");
			Sleep(5000);
		}
	}
}

int main()
{
	resizeConsole(1200, 600);
	Count_down();
	
//	system("start wmplayer \"E:\\Bai tap\\c basic\\C++HappyBirthday-PhanDinhTung_uwaw.wav\"");

	system(" \"HappyBirthday-PhanDinhTung_uwaw.wav\"");
	Firework();
	
	system("pause");
	return 0;
}

