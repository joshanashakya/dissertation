from functools import reducedef convex_hull_graham(points):    TURN_LEFT, TURN_RIGHT, TURN_NONE = (1, -1, 0)    def cmp(a, b):        return (a > b) - (a < b)     def turn(p, q, r):        return cmp((q[0] - p[0])*(r[1] - p[1]) - (r[0] - p[0])*(q[1] - p[1]), 0)     def _keep_left(hull, r):        while len(hull) > 1 and turn(hull[-2], hull[-1], r) not in {TURN_LEFT,TURN_NONE}:        	#Agregar a {TURN_LEFT} el elemento TURN_NONE si se quieren alineados        	#En la frontera            hull.pop()        if not len(hull) or hull[-1] != r:            hull.append(r)        return hull     points = sorted(points)    l = reduce(_keep_left, points, [])    u = reduce(_keep_left, reversed(points), [])    return l.extend(u[i] for i in range(1, len(u) - 1)) or l def d():    total = []     n = int(input())    a, b = [], []    for i in range(n):        x,y = map(int,input().split())        total.append((x,y))        a.append((x,y))     m = int(input())     for j in range(m):        x,y = map(int,input().split())        total.append((x,y))        b.append((x,y))      set_a = set()    for i in a:        set_a.add(i)    for j in b:        if(j in set_a):            print("NO")            return      if(sorted(a)==sorted(convex_hull_graham(total))):        print("YES")    else:        print("NO") d() 		 	 	 			 		   	 		 	 		  	 		
