import mathdef solve(a,b,s):  val = abs(a)+abs(b)  if s < val:    return 'No'  return "Yes" if (s-val) %2 == 0 else "No" def main() :  arr = list(map(int, input().split(' ')))  # arr = []  # for _ in range(3):  #   arr.append(input())  print(solve(*arr))main()