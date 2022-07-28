from math import pown = int(input())m = int(input())if n >=27:  print(m)  exit(0)if n == 1:  print(int(m%2))  exit(0)print(int(m % pow(2,n)))
