def solution(my_string, indices):
    answer = ''
    arr = list(my_string)
    for index in indices:
        arr[index] = ''
    
    answer = ''.join(arr)
    return answer