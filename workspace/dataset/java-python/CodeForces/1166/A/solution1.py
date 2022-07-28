n = int(input())b = [0]*26result = 0for i in range(n):	s = input()	b[ord(s[0])-97]+=1for i in b:	result+=((i//2)*(i//2-1))//2	result+=((i-i//2)*(i-i//2-1))//2print(result)
