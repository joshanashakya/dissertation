def time(h,m):  if h < 0:    h += 24  if h <10:    h = f'{0}{h}'  if m < 10:    m = f'{0}{m}'  return f'{h}:{m}' def solve(s, t):  sh,sm = map(int, s.split(':'))  th,tm = map(int,t.split(':'))  tot_s = sh*60+sm  tot_t = th*60+tm  res = tot_s - tot_t  return time(res//60, res%60)        def main() :  # n = int(input())  # arr = list(map(int, input().split(' ')))  # arr = []  # for _ in range(4):    # i = input()    # arr.append(i)  s = input()  t = input()  print(solve(s,t))main()
