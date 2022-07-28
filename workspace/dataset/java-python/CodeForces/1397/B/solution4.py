# import inbuilt standard input output
from sys import stdin, stdout


# suppose a function called main() and
# all the operations are performed
def main():
    # input via readline method
    n = stdin.readline()

    # array input similar method
    arr = [int(i) for i in stdin.readline().split()]

    arr.sort()

    # initialize variable
    t = int(n) - 1
    p = float(1 / t)

    temp = int((int(arr[t]) ** p) // 1)
    ans = int(0)
    ans1 = int(0)

    for i in range(int(n)):
        ans = int(int(ans) + int(abs(int(int(temp ** i) - arr[i]))))

    temp = int(int(temp) + 1)

    for i in range(int(n)):
        ans1 = int(int(ans1) + int(abs(int(int(temp ** i) - arr[i]))))

    ans = min(int(ans), int(ans1))

    stdout.write(str(ans))


# call the main method
if __name__ == "__main__":
    main()
