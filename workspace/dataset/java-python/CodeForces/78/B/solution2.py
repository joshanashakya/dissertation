if __name__ == "__main__":    s = "ROYGBIV"
cases = ['', 'G', 'GB', 'YGB', 'YGBI', 'OYGBI', 'OYGBIV']
n = int(input())
to_print = n // 7
cases_print = n % 7
print(s * to_print, end="")
print(cases[cases_print], end="")
