def solve(num) :    ans = 0    power = 0    while ans < num :        ans += 2**power        power += 1        return power        print (solve(int(input())))                 
