import string
def solution(my_string):
    arr = [0]*52
    print(arr)
    count = dict.fromkeys(string.ascii_uppercase + string.ascii_lowercase, 0)
    for s in my_string:
        count[s] += 1
    return list(count.values())