import os, sys, atexitfrom io import BytesIO, StringIO input = BytesIO(os.read(0, os.fstat(0).st_size)).readline_OUTPUT_BUFFER = StringIO()sys.stdout = _OUTPUT_BUFFER @atexit.registerdef write():    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())c, d = map(int, input().split())n, m = map(int, input().split())k = int(input())require = n * m - kans = 999999999for i in range(10000):    for j in range(10000):        if i * n + j >= require:            ans = min(ans, c * i + d * j)print(ans)
