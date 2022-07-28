import mathdef solve(a,s,c):  return math.ceil((c*a)/s)-c          def main() :  # n = int(input())  a,s,c = list(map(int, input().split(' ')))  print(solve(a,s,c))main()
