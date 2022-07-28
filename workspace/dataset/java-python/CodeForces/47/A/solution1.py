# -*- coding: utf-8 -*-"""Created on Tue Mar 30 19:32:51 2021 @author: nehas"""n=int(input())l=[(i*(i+1))/2 for i in range(1,n+1)]if n in l:    print("YES")else:    print("NO")
