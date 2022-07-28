a,b,c=[int(x) for x in input().split(' ')]n=int(input())s=[int(x) for x in input().split(' ')]print(sum([int(b<x and x<c) for x in s]))
