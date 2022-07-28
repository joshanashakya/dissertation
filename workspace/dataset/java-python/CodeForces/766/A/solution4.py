def solve(s1, s2):	if s1 == s2:		return -1	else:		return max(len(s1), len(s2)) def main():	s1 = input()	s2 = input()	print(solve(s1, s2))main()
