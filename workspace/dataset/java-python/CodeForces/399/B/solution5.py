n = int(input())s = input()tot = 0for i, ball in enumerate(s):    if ball == 'B':        tot += (1 << i)print(tot) 
