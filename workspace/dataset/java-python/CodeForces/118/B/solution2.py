n = int(input())max_n = 2*(n+1) - 1max_len = 2*max_n - 1 ans = []for i in range(n+1):    tmp = " ".join(map(str,range(i+1)))    tmp += tmp[-2::-1]    ans.append("{0:{1}^{2}}".format(tmp," ", max_len).rstrip(" "))    print(ans[-1])for line in ans[-2::-1]:    print(line)