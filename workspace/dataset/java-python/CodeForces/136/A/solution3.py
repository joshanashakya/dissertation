#!/usr/bin/python3 import sysimport argparseimport json def main():    num_friends = int(sys.stdin.readline().rstrip())     friends = map(int, sys.stdin.readline().rstrip().split(" "))    output = [0] * (num_friends + 1)     for i, friend in enumerate(friends, start=1):        output[friend] = i     print(" ".join(map(str,output[1:])))  def get_tests():    #tests = [("512 4", "50")]     for test in tests:        print(json.dumps({"input": test[0], "output": test[1]})) if __name__ == "__main__":    parser = argparse.ArgumentParser()    parser.add_argument("--get-tests", action="store_true")    args = parser.parse_args()     if args.get_tests:        get_tests()    else:        main()
