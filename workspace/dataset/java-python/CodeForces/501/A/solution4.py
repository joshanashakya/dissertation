import mathdef solve(a,b,c,d):  m = max(3*a//10,a-((a//250)*c))  v = max(3*b//10,b-((b//250)*d))  if m > v:    return 'Misha'  if v > m :    return 'Vasya'  return 'Tie'         def main() :  # n = int(input())  arr = list(map(int, input().split(' ')))  print(solve(*arr))main()
