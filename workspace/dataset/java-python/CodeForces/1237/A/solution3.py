n = int(input())cnt = 0flag = 1for _ in range(n):  a = int(input())  if a % 2 == 0:    print(a // 2)  else:    print((a + flag) // 2)    flag *= -1
