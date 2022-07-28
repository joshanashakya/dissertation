def solve(arr, n):  d = {'rat': 0, 'woman': 1, 'child': 1, 'man': 2, 'captain': 3}


for i in range(1, n):    j = i - 1
key = arr[i][:]
while j >= 0 and d[arr[j][1]] > d[key[1]]:      arr[j + 1] = arr[j]
j -= 1
arr[j + 1] = key
for i in arr:    print(i[0])                

def main():  # s = input()  n = int(input())  # arr = list(map(int, input().split(' ')))  # s = input()  # res=''  arr = []  for _ in range(n):    i = input().split(' ')    arr.append(i)  solve(arr, n)main()
