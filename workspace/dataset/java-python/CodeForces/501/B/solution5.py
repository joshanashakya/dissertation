#Exercício J n = int(input())oldNames = []newNames = []for i in range(n):    old, new = input().split()    if old in newNames:        pos = newNames.index(old)        newNames[pos] = new    else:        oldNames.append(old)        newNames.append(new)  size = len(oldNames)print(size)for j in range(size):    print("%s %s" %(oldNames[j], newNames[j])) 		 	  	 	    			 			 	  			