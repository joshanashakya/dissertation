n = int(input())g = {}for _ in range(n):    s = input().split('reposted')    s1 = s[0].strip().lower()    s2 = s[1].strip().lower()    # print(s1, s2)    if s2 not in g:        g[s2] = set()    g[s2].add(s1) # print(g) mx = 0  def find(v, cnt):    global mx    if v not in g:        if cnt > mx:            mx = cnt        return    for name in g[v]:        find(name, cnt + 1)  find('polycarp', 1)print(mx) """""" # from random import randint## a = [1, 3, 2, 4, 5, 100, 6, 8, 9, 13, 19, 34, 10, 23, 65, 40, 63, 45, 16, 97, 30, 17, 7, 67, 82, 11, 81, 22, 61, 57, 41, 66, 73, 52, 50, 15, 58, 72, 53, 88, 87, 93, 56, 98, 29, 76, 26, 99, 85, 42, 33, 18, 49, 83, 71, 14, 46, 20, 70, 86, 25, 74, 27, 94, 28, 0, 80, 92]# # for k in range(100):# #     a.append(randint(0, 100))## d = {}# b = []# for k, v in enumerate(a):#     new = False#     if v not in d:#         d[v] = 0#         new = True##     last = 0#     for p in range(len(b) - 1, -1, -1):#         val = b[p]#         if last < val <= v:#             if val > d[v]:#                 d[v] = val#             last = val#     if new:#         b.append(v)## print(len(b))## # b = []# # ar = []# ## # for k, v in enumerate(a):# #     lb = len(b)# #     last = 0# #     for k2 in range(lb):# #         arr = b[k2]# #         val = arr[-1]# #         if last < val <= v:# #             arr2 = arr[::]# #             arr.append(v)# #             b.append(arr2)# #             last = val# #             if len(arr) > len(ar):# #                 ar = arr# ## #     if len(b) == lb:# #         b.append([v])# ## # print(len(b))# # b.sort(key=lambda x: len(x))# # for row in b:# #     print(row)# # print('--')# # print(ar)## # def var(s, c):# #     if c == 0:# #         for k in range(10):# #             s1 = str(s) + str(k)# #             print(s1)# #     else:# #         for k in range(10):# #             s1 = str(s) + str(k)# #             var(s1, c - 1)# ## ## # def var0():# #     for k in range(10):# #         var(k, 3)# ## ## # var0()