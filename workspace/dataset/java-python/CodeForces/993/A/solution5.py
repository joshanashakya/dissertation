#include <algorithm>#include <cstdio>#include <cmath> using namespace std ; const double eps=1e-12 , inf=1e15 ; inline int sgn ( double x ){	if ( x>eps ) return 1;	if ( x<-eps ) return -1 ;	return 0 ;} struct pt {	double x , y ;	pt ( double x0=0 , double y0=0 ):x(x0),y(y0) {}	pt operator - ( const pt &p ) const	{ 		pt r(x-p.x,y-p.y);		return r; 	}};pt a[5] , b[5] ;inline double cross ( pt A , pt B ){ return A.x*B.y-A.y*B.x; } int main (){	int i , j ;	for ( i=0 ; i<=3 ; i++ ) 		scanf("%lf%lf",&a[i].x,&a[i].y);	for ( i=0 ; i<=3 ; i++ ) 		scanf("%lf%lf",&b[i].x,&b[i].y);		double u=-inf , d=inf , l=inf , r=-inf ;	for ( i=0 ; i<=3 ; i++ )		u=max(u,b[i].y),		d=min(d,b[i].y),		l=min(l,b[i].x),		r=max(r,b[i].x);	b[4].x=(l+r)/2.0 , b[4].y=(u+d)/2.0 ;		u=-inf , d=inf , l=inf , r=-inf ;	for ( i=0 ; i<=3 ; i++ )		u=max(u,a[i].y),		d=min(d,a[i].y),		l=min(l,a[i].x),		r=max(r,a[i].x);	a[4].x=(l+r)/2.0,a[4].y=(u+d)/2.0;		for ( i=0 ; i<=4 ; i++ ) 		if ( sgn(b[i].y-u)<=0 && sgn(b[i].y-d)>=0 && sgn(b[i].x-l)>=0 && sgn(b[i].x-r)<=0 )			return puts("YES")*0;				double t=sqrt(2.0)/2.0 , x , y ;	for ( i=0 ; i<=4 ; i++ ) 		x=t*(a[i].x-a[i].y),		y=t*(a[i].x+a[i].y),		a[i].x=x,a[i].y=y;	for ( i=0 ; i<=4 ; i++ ) 		x=t*(b[i].x-b[i].y),		y=t*(b[i].x+b[i].y),		b[i].x=x,b[i].y=y;		u=-inf , d=inf , l=inf , r=-inf ;	for ( i=0 ; i<=4 ; i++ )		u=max(u,b[i].y),		d=min(d,b[i].y),		l=min(l,b[i].x),		r=max(r,b[i].x);	for ( i=0 ; i<=4 ; i++ ) 		if ( sgn(a[i].y-u)<=0 && sgn(a[i].y-d)>=0 && sgn(a[i].x-l)>=0 && sgn(a[i].x-r)<=0 )			return puts("YES")*0;		puts("NO");		return 0 ;}
